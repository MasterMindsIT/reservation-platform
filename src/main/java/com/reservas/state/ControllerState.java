package com.reservas.state;


import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/states")
public class ControllerState {
    @Autowired
    private final ServiceState serviceState;
    @Autowired
    public ControllerState(ServiceState serviceState) {
        this.serviceState = serviceState;
    }

    @GetMapping
    public List<States> list(){
        return this.serviceState.list();
    }
    @GetMapping("/{id}")
    public States show(@PathVariable Long id){
        return this.serviceState.show(id);
    }

    @PostMapping
    public States create(@RequestBody States states){
        return this.serviceState.create(states);
    }

    @PutMapping
    public States edit(@RequestBody States states){
        return this.serviceState.edit(states);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceState.delete(id);
    }
}
