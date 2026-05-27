package com.aronnerepo.springboot.dto;
import lombok.Builder;

@Builder
public record CategoryDTO(
        Long id,
        String name) {
}