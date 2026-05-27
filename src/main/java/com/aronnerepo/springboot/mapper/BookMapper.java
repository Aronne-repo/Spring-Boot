package com.aronnerepo.springboot.mapper;
import com.aronnerepo.springboot.dto.*;
import com.aronnerepo.springboot.entities.Book;
import java.util.Set;
import java.util.stream.Collectors;

public class BookMapper {

    public static BookDTO toDTO(Book book) {
        Set<AuthorDTO> authors = book.getAuthors()
                .stream()
                .map(AuthorMapper::toDTO)
                .collect(Collectors.toSet());

        return BookDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .publicationYear(book.getPublicationYear())
                .pages(book.getPages())
                .language(book.getLanguage())
                .category(CategoryMapper.toDTO(book.getCategory()))
                .authors(authors)
                .build();
    }
}