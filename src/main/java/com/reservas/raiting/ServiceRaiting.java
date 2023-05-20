package com.reservas.raiting;

import com.reservas.table.RepositoryTable;
import com.reservas.table.TableRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRaiting {
    @Autowired
    private final RepositoryRaiting repositoryRaiting;

    @Autowired
    public ServiceRaiting(RepositoryRaiting repositoryRaiting){
        this.repositoryRaiting = repositoryRaiting;
    }

    public List<Raiting> list(){ return this.repositoryRaiting.findAll(); }

    public Raiting show(Long id) { return this.repositoryRaiting.findById(id).get(); }

    public Raiting create(Raiting raiting){ return this.repositoryRaiting.save(raiting); }

    public Raiting edit(Raiting raiting){ return this.repositoryRaiting.save(raiting); }

    public void delete(Long id){ this.repositoryRaiting.deleteById(id); }
}
