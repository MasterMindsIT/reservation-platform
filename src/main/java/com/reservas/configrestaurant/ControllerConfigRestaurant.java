package com.reservas.configrestaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/restaurant")
public class ControllerConfigRestaurant {

    @Autowired
    private final ServiceConfigRestaurant serviceConfigRestaurant;

    @Autowired
    public ControllerConfigRestaurant(ServiceConfigRestaurant serviceConfigRestaurant){
        this.serviceConfigRestaurant = serviceConfigRestaurant;
    }

    @GetMapping
    public List<ConfigRestaurant> list(){ return this.serviceConfigRestaurant.list(); }

    @GetMapping("/{id}")
    public ConfigRestaurant show(@PathVariable Long id){ return this.serviceConfigRestaurant.show(id); }

    @PostMapping
    public ConfigRestaurant create(@RequestBody ConfigRestaurant configRestaurant){ return this.serviceConfigRestaurant.create(configRestaurant); }

    @PutMapping
    public ConfigRestaurant edit(@RequestBody ConfigRestaurant configRestaurant){ return this.serviceConfigRestaurant.edit(configRestaurant); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ this.delete(id); }

}
