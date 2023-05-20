package com.reservas.sucursalschedule;

import com.reservas.table.RepositoryTable;
import com.reservas.table.TableRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSchedule {
    @Autowired
    private final RepositorySchedule repositorySchedule;

    @Autowired
    public ServiceSchedule(RepositorySchedule repositorySchedule){
        this.repositorySchedule = repositorySchedule;
    }

    public List<Schedule> list(){ return this.repositorySchedule.findAll(); }

    public Schedule show(Long id) { return this.repositorySchedule.findById(id).get(); }

    public Schedule create(Schedule schedule){ return this.repositorySchedule.save(schedule); }

    public Schedule edit(Schedule schedule){ return this.repositorySchedule.save(schedule); }

    public void delete(Long id){ this.repositorySchedule.deleteById(id); }

}
