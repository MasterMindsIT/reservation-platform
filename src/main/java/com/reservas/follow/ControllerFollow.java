package com.reservas.follow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/follow")
public class ControllerFollow {

    @Autowired
    private final ServiceFollow serviceFollow;
    @Autowired
    public ControllerFollow(ServiceFollow serviceFollow) {
        this.serviceFollow = serviceFollow;
    }

    @GetMapping
    public List<Follow> list(){
        return this.serviceFollow.list();
    }
    @GetMapping("/{id}")
    public Follow show(@PathVariable Long id){
        return this.serviceFollow.show(id);
    }

    @PostMapping
    public Follow create(@RequestBody Follow follow){
        return this.serviceFollow.create(follow);
    }

    @PutMapping
    public Follow edit(@RequestBody Follow follow){
        return this.serviceFollow.edit(follow);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.serviceFollow.delete(id);
    }
}
