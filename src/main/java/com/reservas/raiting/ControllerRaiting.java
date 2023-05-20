package com.reservas.raiting;

import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/raiting")
public class ControllerRaiting {
    @Autowired
    private final ServiceRaiting serviceRaiting;
    @Autowired
    public ControllerRaiting(ServiceRaiting serviceRaiting) {
        this.serviceRaiting = serviceRaiting;
    }

    @GetMapping
    public List<Raiting> list(){
        return this.serviceRaiting.list();
    }
    @GetMapping("/{id}")
    public Raiting show(@PathVariable Long id){
        return this.serviceRaiting.show(id);
    }

    @PostMapping
    public Raiting create(@RequestBody Raiting raiting){
        return this.serviceRaiting.create(raiting);
    }

    @PutMapping
    public Raiting edit(@RequestBody Raiting raiting){
        return this.serviceRaiting.edit(raiting);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceRaiting.delete(id);
    }
}
