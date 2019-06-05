package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @GetMapping("/getAllCategories")
    public List<Category> getAllCategorys() {
        List<Category> categories = new ArrayList<>();

        return categories;
    }

    @GetMapping("/getSingleCategory/")
    public Category getSingleCategory() {
        Category category = new Category();
        return category;
    }


    @PostMapping("/createCategory")
    public Category createCategory() {
        Category category = new Category();
        return category;
    }

    @PatchMapping("/updateCategory")
    public Category updateCategory() {
        Category category = new Category();
        return category;
    }

    @DeleteMapping("/deleteCategory")
    public Category deleteCategory() {
        Category category = new Category();
        return category;
    }
}
