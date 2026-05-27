package com.aronnerepo.springboot.service;
import com.aronnerepo.springboot.dto.AuthorDTO;
import com.aronnerepo.springboot.entities.Author;
import com.aronnerepo.springboot.mapper.AuthorMapper;
import com.aronnerepo.springboot.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor

public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<AuthorDTO> getAllAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(AuthorMapper::toDTO)
                .toList();
    }

    public AuthorDTO getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autore non trovato."));
        return AuthorMapper.toDTO(author);
    }

    public AuthorDTO saveAuthor(AuthorDTO dto) {
        Author author = AuthorMapper.toEntity(dto);
        Author saved = authorRepository.save(author);
        return AuthorMapper.toDTO(saved);
    }
}