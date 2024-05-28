package com.shoppingcart.shopping_cart.service;

import com.shoppingcart.shopping_cart.model.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);

    public Boolean existCategory(String name);
    public List<Category> getAllCategory();
}
