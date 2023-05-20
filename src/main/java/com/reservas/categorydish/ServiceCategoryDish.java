package com.reservas.categorydish;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ServiceCategoryDish {
    @Autowired
    private final RepositoryCategoryDish repositoryCategoryDish;

    @Autowired
    public ServiceCategoryDish(RepositoryCategoryDish repositoryCategoryDish){
        this.repositoryCategoryDish = repositoryCategoryDish;
    }

    public List<CategoryDish> list(){
        return this.repositoryCategoryDish.findAll();
    }

    public CategoryDish show(Long id){ return this.repositoryCategoryDish.findById(id).get(); }

    public CategoryDish create(CategoryDish categoryDish){
        return this.repositoryCategoryDish.save(categoryDish);
    }

    public CategoryDish edit(CategoryDish categoryDish){
        return this.repositoryCategoryDish.save(categoryDish);
    }

    public void delete(Long id){ this.repositoryCategoryDish.deleteById(id);}


}
