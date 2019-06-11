package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.Category;
import com.vinhnq21.core.cms.entities.Category;

import java.util.List;


public interface CategoryService {

    List<Category> getAllCategory();

    Category getSingleCategory(int categoryId);

    Category insertCategory(Category categoryData);

    Category updateCategory(Category newCategoryDataWithId);

    Category deleteCategory(int categoryId);

}
