package com.reservas.follow;

import com.reservas.state.RepositoryState;
import com.reservas.state.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceFollow {
    @Autowired
    private final RepositoryFollow repositoryFollow;

    @Autowired
    public ServiceFollow (RepositoryFollow repositoryFollow){
        this.repositoryFollow = repositoryFollow;
    }

    public List<Follow> list(){ return this.repositoryFollow.findAll(); }

    public Follow show(Long id){ return this.repositoryFollow.findById(id).get(); }

    public Follow create(Follow follow){ return this.repositoryFollow.save(follow); }

    public Follow edit(Follow follow){ return this.repositoryFollow.save(follow); }

    public void delete(Long id){ this.delete(id); }

}
