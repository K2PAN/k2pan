package com.k2pan.api.controllers.ecommerce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.k2pan.api.models.ecommerce.Category;
import com.k2pan.api.models.ecommerce.CategoryRepository;

import io.micrometer.core.ipc.http.HttpSender.Response;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // , Sort.by(Sort.Direction.ASC, "id") Sort.by("name")
    public List<Category> getCategory() {
        List<Category> categorys = categoryRepository.findAll();
        return categorys;
    }

    public Category setCategory(Category category) {
        return categoryRepository.save(category);
    }

    public ResponseEntity<Category> updateCategory(Long id, Category updateCategory) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            updateCategory.setId(id);
            Category savedCategory = categoryRepository.save(updateCategory);
            return ResponseEntity.ok(savedCategory);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> deleteCategory(Long id) {

        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            categoryRepository.delete(category.get());
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }

}
