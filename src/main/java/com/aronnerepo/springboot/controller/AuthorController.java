package com.aronnerepo.springboot.controller;
import com.aronnerepo.springboot.dto.AuthorDTO;
import com.aronnerepo.springboot.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public List<AuthorDTO> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorDTO getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public AuthorDTO saveAuthor(@RequestBody AuthorDTO dto) {
        return authorService.saveAuthor(dto);
    }
}