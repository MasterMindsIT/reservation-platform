package com.reservas.role;

import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/role")
public class ControllerRole {
    @Autowired
    private final ServiceRole serviceRole;
    @Autowired
    public ControllerRole(ServiceRole serviceRole) {
        this.serviceRole = serviceRole;
    }

    @GetMapping
    public List<Roles> list(){
        return this.serviceRole.list();
    }
    @GetMapping("/{id}")
    public Roles show(@PathVariable Long id){
        return this.serviceRole.show(id);
    }

    @PostMapping
    public Roles create(@RequestBody Roles roles){
        return this.serviceRole.create(roles);
    }

    @PutMapping
    public Roles edit(@RequestBody Roles roles){
        return this.serviceRole.edit(roles);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceRole.delete(id);
    }
}
