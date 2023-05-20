package com.reservas.detailraiting;

import com.reservas.autority.Authority;
import com.reservas.autority.ServiceAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("api/detail-raiting")
public class ControllerDetailRaiting {
    @Autowired
    private final ServiceDetailRaiting serviceDetailRaiting;

    @Autowired
    public ControllerDetailRaiting(ServiceDetailRaiting serviceDetailRaiting) {
        this.serviceDetailRaiting = serviceDetailRaiting;
    }

    @GetMapping("/{id}")
    public DetailRaiting show(@PathVariable Long id){
        return this.serviceDetailRaiting.show(id);
    }

    @GetMapping
    public List<DetailRaiting> list(){
        return this.serviceDetailRaiting.list();
    }

    @PostMapping
    public DetailRaiting create(@RequestBody DetailRaiting detailRaiting){
        return this.serviceDetailRaiting.create(detailRaiting);
    }

    public DetailRaiting edit(@RequestBody DetailRaiting authority){
        return this.serviceDetailRaiting.edit(authority);
    }

    public void delete(@PathVariable Long id){
        this.serviceDetailRaiting.delete(id);
    }
}
