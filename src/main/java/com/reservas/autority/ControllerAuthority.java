package com.reservas.autority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/authority")
public class ControllerAuthority {

    @Autowired
    private final ServiceAuthority serviceAuthority;

    @Autowired
    public ControllerAuthority(ServiceAuthority serviceAuthority) {
        this.serviceAuthority = serviceAuthority;
    }

    @GetMapping("/{id}")
    public Authority show(@PathVariable Long id){
        return this.serviceAuthority.show(id);
    }

    @GetMapping
    public List<Authority> list(){
        return this.serviceAuthority.list();
    }

    @PostMapping
    public Authority create(@RequestBody Authority authority){
        return this.serviceAuthority.create(authority);
    }

    public Authority edit(@RequestBody Authority authority){
        return this.serviceAuthority.edit(authority);
    }

    public void delete(@PathVariable Long id){
        this.serviceAuthority.delete(id);
    }
}
