package com.aronnerepo.springboot.dto;
import lombok.Builder;
import java.time.LocalDate;

@Builder
public record AuthorDTO(
        Long id,
        String firstName,
        String lastName,
        LocalDate birthDate,
        String nationality) {
}