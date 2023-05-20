package com.reservas.sucursalmap;

import com.reservas.table.RepositoryTable;
import com.reservas.table.TableRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMap {

    @Autowired
    private final RepositoryMap repositoryMap;

    @Autowired
    public ServiceMap(RepositoryMap repositoryMap){
        this.repositoryMap = repositoryMap;
    }

    public List<Maps> list(){ return this.repositoryMap.findAll(); }

    public Maps show(Long id) { return this.repositoryMap.findById(id).get(); }

    public Maps create(Maps maps){ return this.repositoryMap.save(maps); }

    public Maps edit(Maps maps){ return this.repositoryMap.save(maps); }

    public void delete(Long id){ this.repositoryMap.deleteById(id); }

}
