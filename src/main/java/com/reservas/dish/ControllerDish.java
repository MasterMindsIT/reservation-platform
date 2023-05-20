package com.reservas.dish;


import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/dish")
public class ControllerDish {

    @Autowired
    private final ServiceDish serviceDish;
    @Autowired
    public ControllerDish(ServiceDish serviceDish) {
        this.serviceDish = serviceDish;
    }

    @GetMapping
    public List<Dish> list(){
        return this.serviceDish.list();
    }
    @GetMapping("/{id}")
    public Dish show(@PathVariable Long id){
        return this.serviceDish.show(id);
    }

    @PostMapping
    public Dish create(@RequestBody Dish dish){
        return this.serviceDish.create(dish);
    }

    @PutMapping
    public Dish edit(@RequestBody Dish dish){
        return this.serviceDish.edit(dish);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceDish.delete(id);
    }
}
