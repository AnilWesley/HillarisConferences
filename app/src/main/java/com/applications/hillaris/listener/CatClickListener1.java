package com.applications.hillaris.listener;


import com.applications.hillaris.models.Categories;

public interface CatClickListener1 {

    void onAddClick(int position, Categories categories);
    void onRemoveClick(int position, Categories categories);

}
