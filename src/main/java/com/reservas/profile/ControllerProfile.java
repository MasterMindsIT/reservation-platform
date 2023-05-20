package com.reservas.profile;


import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/profile")
public class ControllerProfile {
    @Autowired
    private final ServiceProfile serviceProfile;
    @Autowired
    public ControllerProfile(ServiceProfile serviceProfile) {
        this.serviceProfile = serviceProfile;
    }

    @GetMapping
    public List<Profile> list(){
        return this.serviceProfile.list();
    }
    @GetMapping("/{id}")
    public Profile show(@PathVariable Long id){
        return this.serviceProfile.show(id);
    }

    @PostMapping
    public Profile create(@RequestBody Profile profile){
        return this.serviceProfile.create(profile);
    }

    @PutMapping
    public Profile edit(@RequestBody Profile profile){
        return this.serviceProfile.edit(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceProfile.delete(id);
    }
}
