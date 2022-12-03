package com.driver.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AuthorDto {

    private String name;

    @Column(unique = true)
    private String email;

    private int age;
    private String country;

}
