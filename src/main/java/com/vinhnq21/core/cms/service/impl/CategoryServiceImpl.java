package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Category;
import com.vinhnq21.core.cms.repository.CategoryRepository;
import com.vinhnq21.core.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getSingleCategory(int categoryId) {
        Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
        if (!optionalCategory.isPresent()) {
            throw new RuntimeException("Category not found");
        } else {
            return optionalCategory.get();
        }
    }

    @Override
    public Category insertCategory(Category categoryData) {

        categoryData.setId(0);

        categoryRepository.save(categoryData);

        return categoryData;
    }

    @Override
    public Category updateCategory(Category newCategoryDataWithId) {

        Optional<Category> optionalCategory = categoryRepository.findById(newCategoryDataWithId.getId());

        if (!optionalCategory.isPresent()) {
            throw new RuntimeException("Category not found");
        } else {
            categoryRepository.save(newCategoryDataWithId);
        }

        return newCategoryDataWithId;
    }

    @Override
    public Category deleteCategory(int categoryId) {

        Optional<Category> optionalCategory = categoryRepository.findById(categoryId);

        if (!optionalCategory.isPresent()) {
            throw new RuntimeException("Category not found");
        } else {
            categoryRepository.deleteById(categoryId);
        }

        return optionalCategory.get();
    }

}
