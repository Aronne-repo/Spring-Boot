package com.aronnerepo.springboot.service;
import com.aronnerepo.springboot.dto.BookDTO;
import com.aronnerepo.springboot.entities.Book;
import com.aronnerepo.springboot.mapper.BookMapper;
import com.aronnerepo.springboot.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookMapper::toDTO)
                .toList();
    }

    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro non trovato"));
        return BookMapper.toDTO(book);
    }
}