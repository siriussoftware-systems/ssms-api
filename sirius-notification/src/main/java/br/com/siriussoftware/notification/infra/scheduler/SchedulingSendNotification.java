package br.com.siriussoftware.notification.infra.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.siriussoftware.library.base.service.BusinessException;
import br.com.siriussoftware.library.base.service.ExclusionNotPermitedException;
import br.com.siriussoftware.notification.service.notificacao.NotificacaoService;

@Component
public class SchedulingSendNotification {

	@Autowired
	private NotificacaoService notificacaoService;

	@Scheduled(cron = "*/60 * * * * *") // minute hour day (month) month day(week)
	public void scheduleTaskWithFixedRate() throws ExclusionNotPermitedException, BusinessException {
		notificacaoService.enviarNotificacoes();
	}

}
