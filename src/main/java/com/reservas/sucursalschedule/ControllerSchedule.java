package com.reservas.sucursalschedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/schedule")
public class ControllerSchedule {
    @Autowired
    private final ServiceSchedule serviceSchedule;
    @Autowired
    public ControllerSchedule(ServiceSchedule serviceSchedule) {
        this.serviceSchedule = serviceSchedule;
    }

    @GetMapping
    public List<Schedule> list(){
        return this.serviceSchedule.list();
    }
    @GetMapping("/{id}")
    public Schedule show(@PathVariable Long id){
        return this.serviceSchedule.show(id);
    }

    @PostMapping
    public Schedule create(@RequestBody Schedule schedule){
        return this.serviceSchedule.create(schedule);
    }

    @PutMapping
    public Schedule edit(@RequestBody Schedule schedule){
        return this.serviceSchedule.edit(schedule);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceSchedule.delete(id);
    }
}
