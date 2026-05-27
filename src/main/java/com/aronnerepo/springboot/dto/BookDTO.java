package com.aronnerepo.springboot.dto;
import lombok.Builder;
import java.util.Set;

@Builder
public record BookDTO(
        Long id,
        String title,
        String isbn,
        Integer publicationYear,
        Integer pages,
        String language,
        CategoryDTO category,
        Set<AuthorDTO> authors) {
}