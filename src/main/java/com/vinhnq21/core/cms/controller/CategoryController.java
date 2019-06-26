package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.dto.CategoryDTO;
import com.vinhnq21.core.cms.entities.Category;
import com.vinhnq21.core.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getAllCategorys() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/{categoryId}")
    public Category getSingleCategory(@PathVariable int categoryId) {
        return categoryService.getSingleCategory(categoryId);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category categoryData) {
        return categoryService.insertCategory(categoryData);
    }

    @PatchMapping
    public Category updateCategory(@RequestBody Category categoryData) {
        return categoryService.updateCategory(categoryData);
    }

    @DeleteMapping("/{categoryId}")
    public Category deleteCategory(@PathVariable int categoryId) {
        return categoryService.deleteCategory(categoryId);
    }
}
