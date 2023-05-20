package com.reservas.role;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceRole {
    @Autowired
    private final RepositoryRole repositoryRole;

    @Autowired
    public ServiceRole(RepositoryRole repositoryRole){
        this.repositoryRole = repositoryRole;
    }

    public List<Roles> list(){ return this.repositoryRole.findAll(); }

    public Roles show(Long id) { return this.repositoryRole.findById(id).get(); }

    public Roles create(Roles roles){ return this.repositoryRole.save(roles); }

    public Roles edit(Roles roles){ return this.repositoryRole.save(roles); }

    public void delete(Long id){ this.repositoryRole.deleteById(id); }

}
