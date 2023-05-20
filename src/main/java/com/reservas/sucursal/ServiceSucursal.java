package com.reservas.sucursal;

import com.reservas.table.RepositoryTable;
import com.reservas.table.TableRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSucursal {

    @Autowired
    private final RepositorySucursal repositorySucursal;

    @Autowired
    public ServiceSucursal(RepositorySucursal repositorySucursal){
        this.repositorySucursal = repositorySucursal;
    }

    public List<Sucursal> list(){ return this.repositorySucursal.findAll(); }

    public Sucursal show(Long id) { return this.repositorySucursal.findById(id).get(); }

    public Sucursal create(Sucursal sucursal){ return this.repositorySucursal.save(sucursal); }

    public Sucursal edit(Sucursal sucursal){ return this.repositorySucursal.save(sucursal); }

    public void delete(Long id){ this.repositorySucursal.deleteById(id); }
}
