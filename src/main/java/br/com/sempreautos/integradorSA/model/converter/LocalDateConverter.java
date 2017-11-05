package br.com.sempreautos.integradorSA.model.converter;

import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LocalDateConverter implements AttributeConverter<java.time.LocalDate, java.sql.Date> {

	@Override
	public java.sql.Date convertToDatabaseColumn(LocalDate entityValue) {
	    return entityValue == null ? null : java.sql.Date.valueOf(entityValue);
	}

	@Override
	public LocalDate convertToEntityAttribute(java.sql.Date dbValue) {
	    return dbValue == null ? null : dbValue.toLocalDate(); 	}

}