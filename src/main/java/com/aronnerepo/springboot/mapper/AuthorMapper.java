package com.aronnerepo.springboot.mapper;
import com.aronnerepo.springboot.dto.AuthorDTO;
import com.aronnerepo.springboot.entities.Author;

public class AuthorMapper {

    public static AuthorDTO toDTO(Author author) {
        return AuthorDTO.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .birthDate(author.getBirthDate())
                .nationality(author.getNationality())
                .build();
    }

    public static Author toEntity(AuthorDTO dto) {
        return Author.builder()
                .id(dto.id())
                .firstName(dto.firstName())
                .lastName(dto.lastName())
                .birthDate(dto.birthDate())
                .nationality(dto.nationality())
                .build();
    }
}