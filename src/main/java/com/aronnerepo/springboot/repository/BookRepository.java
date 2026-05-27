package com.aronnerepo.springboot.repository;
import com.aronnerepo.springboot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingIgnoreCase(String title);

    List<Book> findByCategoryName(String categoryName);

    List<Book> findByAuthorsLastName(String lastName);
}