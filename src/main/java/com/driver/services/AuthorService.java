package com.driver.services;

import com.driver.Converter.AuthorConverter;
import com.driver.dto.AuthorDto;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository1;

//    public void create(AuthorDto authorDto){
//            Author author = AuthorConverter.convertDtoToEntity(authorDto);
//
//            authorRepository1.save(author);
//
//    }

    public void create(Author author) {
        authorRepository1.save(author);
    }
}
