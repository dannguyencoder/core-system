package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Category;
import com.vinhnq21.core.cms.entities.Category;
import com.vinhnq21.core.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categorys")
    public List<Category> getAllCategorys() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/categorys/{categoryId}")
    public Category getSingleCategory(@PathVariable int categoryId) {
        return categoryService.getSingleCategory(categoryId);
    }

    @PostMapping("/categorys")
    public Category createCategory(@RequestBody Category categoryData) {
        return categoryService.insertCategory(categoryData);
    }

    @PatchMapping("/categorys")
    public Category updateCategory(@RequestBody Category categoryData) {
        return categoryService.updateCategory(categoryData);
    }

    @DeleteMapping("/categorys/{categoryId}")
    public Category deleteCategory(@PathVariable int categoryId) {
        return categoryService.deleteCategory(categoryId);
    }
}
