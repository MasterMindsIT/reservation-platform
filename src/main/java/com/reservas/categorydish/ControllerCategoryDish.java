package com.reservas.categorydish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/category-dish")
public class ControllerCategoryDish {

    @Autowired
    private final ServiceCategoryDish serviceCategoryDish;

    @Autowired
    public ControllerCategoryDish(ServiceCategoryDish serviceCategoryDish){
        this.serviceCategoryDish = serviceCategoryDish;
    }

    @GetMapping
    public List<CategoryDish> list(){ return this.serviceCategoryDish.list(); }

    @GetMapping("/{id}")
    public CategoryDish show(@PathVariable Long id){ return this.serviceCategoryDish.show(id); }

    @PostMapping
    public CategoryDish create(@RequestBody CategoryDish categoryDish) { return this.serviceCategoryDish.create(categoryDish); }

    @PutMapping
    public CategoryDish edit(@RequestBody CategoryDish categoryDish){ return this.serviceCategoryDish.edit(categoryDish); }


}
