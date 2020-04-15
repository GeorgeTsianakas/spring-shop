package com.springrest.shop.api.mapper;

import com.springrest.shop.api.model.CategoryDTO;
import com.springrest.shop.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);

}
