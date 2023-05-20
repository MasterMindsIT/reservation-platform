package com.reservas.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("api/booking")
public class ControllerBooking {
    @Autowired
    private final ServiceBooking serviceBooking;
    @Autowired
    public ControllerBooking(ServiceBooking serviceBooking) {
        this.serviceBooking = serviceBooking;
    }

    @GetMapping
    public List<Booking> list(){
        return this.serviceBooking.list();
    }
    @GetMapping("/{id}")
    public Booking show(@PathVariable Long id){
        return this.serviceBooking.show(id);
    }

    @PostMapping
    public Booking create(@RequestBody Booking booking){
        return this.serviceBooking.create(booking);
    }

    @PutMapping
    public Booking edit(@RequestBody Booking booking){
        return this.serviceBooking.edit(booking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceBooking.delete(id);
    }

}
