package com.reservas.profile;

import com.reservas.table.RepositoryTable;
import com.reservas.table.TableRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProfile {
    @Autowired
    private final RepositoryProfile repositoryProfile;

    @Autowired
    public ServiceProfile(RepositoryProfile repositoryProfile){
        this.repositoryProfile = repositoryProfile;
    }

    public List<Profile> list(){ return this.repositoryProfile.findAll(); }

    public Profile show(Long id) { return this.repositoryProfile.findById(id).get(); }

    public Profile create(Profile profile){ return this.repositoryProfile.save(profile); }

    public Profile edit(Profile profile){ return this.repositoryProfile.save(profile); }

    public void delete(Long id){ this.repositoryProfile.deleteById(id); }
}
