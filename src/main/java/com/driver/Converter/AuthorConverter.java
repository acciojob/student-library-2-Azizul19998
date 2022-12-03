package com.driver.Converter;

import com.driver.dto.AuthorDto;
import com.driver.models.Author;

public class AuthorConverter {
    public static Author convertDtoToEntity(AuthorDto authorDto) {
        return Author.builder().name(authorDto.getName())
                .email(authorDto.getEmail())
                .age(authorDto.getAge())
                .country(authorDto.getCountry())
                .build();
    }
}
