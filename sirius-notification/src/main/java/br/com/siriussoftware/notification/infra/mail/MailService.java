/*
 * Copyright (c) 2003, 2019, Sirius Software Ltda and/or its affiliates. All rights reserved.
 * SIRIUS SOFTWARE LTDA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package br.com.siriussoftware.notification.infra.mail;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.notification.domain.configuracao.ConfiguracaoNotificacao;
import br.com.siriussoftware.notification.domain.empresa.Empresa;
import br.com.siriussoftware.notification.service.configuracao.ConfiguracaoNotificacaoService;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * The Class MailService.
 */
@Service
public class MailService {

	/** The mail sender. */
	@Autowired(required = true)
	private JavaMailSender mailSender;

	/** The free marker configuration. */
	@Autowired
	private Configuration freeMarkerConfiguration;

	/** The configuracao empresa service. */
	@Autowired
	private ConfiguracaoNotificacaoService configuracaoNotificacaoService;

	private Map<String, String> mapImagens;

	private void configureJavaMailSender(SistemaEnum sistema, Empresa empresa) {
		ConfiguracaoNotificacao configuracaoEmpresa = configuracaoNotificacaoService.findBySistemaAndEmpresa(sistema,
				empresa);

		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();

		if (configuracaoEmpresa != null) {
			mailSenderImpl.setHost(configuracaoEmpresa.getMailHost());
			mailSenderImpl.setPort(new Long(configuracaoEmpresa.getMailPort()).intValue());

			mailSenderImpl.setUsername(configuracaoEmpresa.getMailUsername());
			mailSenderImpl.setPassword(configuracaoEmpresa.getMailPassword());

			Properties props = mailSenderImpl.getJavaMailProperties();
			props.put("mail.transport.protocol", configuracaoEmpresa.getMailProtocol());
			props.put("mail.smtp.auth", configuracaoEmpresa.isMailSmtpsAuth());
			props.put("mail.smtp.starttls.enable", configuracaoEmpresa.isMailSmtpsStarttsEnable());
			props.put("mail.smtp.starttls.required", "true");
			props.put("mail.smtp.ssl.enable", "false");
			props.put("mail.test-connection", "true");
			props.put("mail.mime.charset", "true");
		}

		mapImagens = new HashMap<>();
		mapImagens.put("logo.png", "/static/img/logo.png");
		mapImagens.put("footer.png", "/static/image/logo.png");

		mailSender = mailSenderImpl;
	}

	public void enviarEmail(SistemaEnum sistema, Empresa empresa, String de, String para, String assunto,
			String conteudo, boolean emailSimples, List<String> anexos) throws SendMailException {
		try {

			this.configureJavaMailSender(sistema, empresa);

			if (anexos != null && !anexos.isEmpty()) {
				emailSimples = false;
			}

			if (emailSimples) {
				SimpleMailMessage message = new SimpleMailMessage();
				message.setFrom(de);
				message.setTo(para);
				message.setSubject(assunto);
				message.setText(conteudo);
				message.setSentDate(new Date());

				mailSender.send(message);
			} else {
				MimeMessage mail = mailSender.createMimeMessage();

				MimeMessageHelper helper = new MimeMessageHelper(mail, true, "UTF-8");
				helper.setFrom(de);
				helper.setTo(para);
				helper.setSubject(assunto);
				helper.setText(conteudo, true);
				helper.setSentDate(new Date());

				if (anexos != null) {
					for (String anexo : anexos) {
						FileSystemResource file = new FileSystemResource(new File(anexo));
						helper.addAttachment(MimeUtility.encodeWord(anexo, "UTF-8", null), file);
					}
				}

				if (mapImagens != null) {
					for (String keyImagem : mapImagens.keySet()) {
						InputStreamSource imageSource = new ByteArrayResource(
								IOUtils.toByteArray(getClass().getResourceAsStream(mapImagens.get(keyImagem))));
						helper.addInline(keyImagem, imageSource, "image/png");
					}
				}

				mailSender.send(mail);
			}
		} catch (Exception e) {
			throw new SendMailException(e.getMessage());
		}
	}

	public String parserEmailToTemplate(Map<String, Object> model, String templateName) throws SendMailException {
		try {
			// Using a subfolder such as /templates here
			freeMarkerConfiguration.setClassForTemplateLoading(this.getClass(), "/email-templates/");

			Template t = freeMarkerConfiguration.getTemplate(templateName);
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
			return html;
		} catch (Exception e) {
			throw new SendMailException(e.getMessage());
		}
	}

}
