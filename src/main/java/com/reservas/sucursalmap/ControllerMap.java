package com.reservas.sucursalmap;

import com.reservas.booking.Booking;
import com.reservas.booking.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/map")
public class ControllerMap {
    @Autowired
    private final ServiceMap serviceMap;
    @Autowired
    public ControllerMap(ServiceMap serviceMap) {
        this.serviceMap = serviceMap;
    }

    @GetMapping
    public List<Maps> list(){
        return this.serviceMap.list();
    }
    @GetMapping("/{id}")
    public Maps show(@PathVariable Long id){
        return this.serviceMap.show(id);
    }

    @PostMapping
    public Maps create(@RequestBody Maps maps){
        return this.serviceMap.create(maps);
    }

    @PutMapping
    public Maps edit(@RequestBody Maps maps){
        return this.serviceMap.edit(maps);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceMap.delete(id);
    }
}
