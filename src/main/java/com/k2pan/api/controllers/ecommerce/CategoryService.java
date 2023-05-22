package com.k2pan.api.controllers.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.k2pan.api.models.ecommerce.Category;
import com.k2pan.api.models.ecommerce.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // , Sort.by(Sort.Direction.ASC, "id")   Sort.by("name")
    public List<Category> getCategory() {
        List<Category> categorys = categoryRepository.findAll();
        return categorys;
    }

    public Category setCategory(Category category) {
        return categoryRepository.save(category);
    }

}
