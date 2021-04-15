package br.com.siriussoftware.suporte.admin.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(false);
		// this.createBigDecimalConverter(modelMapper);
		// this.createStringConverter(modelMapper);
		// this.createBooleanConverter(modelMapper);
		// modelMapper.validate();

		// modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
		// modelMapper.addConverter(new DateToString());
		return modelMapper;
	}
	//
	// private void createBigDecimalConverter(ModelMapper modelMapper) {
	// Converter<String, BigDecimal> converter = new Converter<String, BigDecimal>()
	// {
	// public BigDecimal convert(MappingContext<String, BigDecimal> context) {
	// return context.getSource() == null ? null : new
	// BigDecimal(context.getSource().replaceAll(",", "."));
	// }
	// };
	//
	// TypeMap<String, BigDecimal> typeMap = modelMapper.createTypeMap(String.class,
	// BigDecimal.class);
	// typeMap.setConverter(converter);
	// }
	//
	// private void createStringConverter(ModelMapper modelMapper) {
	// Converter<String, String> converter = new Converter<String, String>() {
	// public String convert(MappingContext<String, String> context) {
	// return context.getSource() == null ? null : context.getSource();
	// }
	// };
	//
	// TypeMap<String, String> typeMap = modelMapper.createTypeMap(String.class,
	// String.class);
	// typeMap.setConverter(converter);
	// }
	//
	//
	// private void createBooleanConverter(ModelMapper modelMapper) {
	// Converter<String, Boolean> converter = new Converter<String, Boolean>() {
	// public Boolean convert(MappingContext<String, Boolean> context) {
	// return context.getSource() == null ? Boolean.FALSE : new
	// Boolean(context.getSource());
	// }
	// };
	//
	// TypeMap<String, Boolean> typeMap = modelMapper.createTypeMap(String.class,
	// Boolean.class);
	// typeMap.setConverter(converter);
	// }
}
