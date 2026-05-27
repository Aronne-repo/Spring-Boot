package com.aronnerepo.springboot.mapper;
import com.aronnerepo.springboot.dto.CategoryDTO;
import com.aronnerepo.springboot.entities.Category;

public class CategoryMapper {

    public static CategoryDTO toDTO(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto) {
        return Category.builder()
                .id(dto.id())
                .name(dto.name())
                .build();
    }
}