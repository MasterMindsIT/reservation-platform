package com.reservas.autority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAuthority {

    @Autowired
    private final RepositoryAuthority repositoryAuthority;

    @Autowired
    public ServiceAuthority(RepositoryAuthority repositoryAuthority) {
        this.repositoryAuthority = repositoryAuthority;
    }

    public Authority show(Long id){
        return this.repositoryAuthority.findById(id).get();
    }

    public List<Authority> list(){
        return this.repositoryAuthority.findAll();
    }

    public Authority create(Authority authority){
        return  this.repositoryAuthority.save(authority);
    }

    public Authority edit(Authority authority){
        return this.repositoryAuthority.save(authority);
    }

    public void delete(Long id){
        this.repositoryAuthority.deleteById(id);
    }

}
