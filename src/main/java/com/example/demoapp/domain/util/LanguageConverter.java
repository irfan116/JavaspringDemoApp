package com.example.demoapp.domain.util;

import com.example.demoapp.domain.Language;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LanguageConverter implements AttributeConverter<Language,Integer> {
    @Override
    public Integer convertToDatabaseColumn(Language language) {
        if(language != null) {
            return language.getId();
        }
        return null;
    }

    @Override
    public Language convertToEntityAttribute(Integer id) {
        if(id != null) {
            return Language.fromId(id);
        }
        return null;
    }
}
