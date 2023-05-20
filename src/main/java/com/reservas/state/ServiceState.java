package com.reservas.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceState {

    @Autowired
    private final RepositoryState repositoryStates;

    @Autowired
    public ServiceState (RepositoryState repositoryStates){
        this.repositoryStates = repositoryStates;
    }

    public List<States> list(){ return this.repositoryStates.findAll(); }

    public States show(Long id){ return this.repositoryStates.findById(id).get(); }

    public States create(States states){ return this.repositoryStates.save(states); }

    public States edit(States states){ return this.repositoryStates.save(states); }

    public void delete(Long id){ this.delete(id); }

}
