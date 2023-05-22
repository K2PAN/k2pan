package com.k2pan.api.controllers.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2pan.api.models.ecommerce.Category;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getCategory() {
        return categoryService.getCategory();
    }

    @PostMapping
    public Category setCategory(@RequestBody Category category){
        return categoryService.setCategory(category);
    }

}
