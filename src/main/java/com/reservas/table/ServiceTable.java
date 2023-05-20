package com.reservas.table;

import com.reservas.configrestaurant.ConfigRestaurant;
import com.reservas.configrestaurant.RepositoryConfigRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTable {
    @Autowired
    private final RepositoryTable repositoryTable;

    @Autowired
    public ServiceTable(RepositoryTable repositoryTable){
        this.repositoryTable = repositoryTable;
    }

    public List<TableRest> list(){ return this.repositoryTable.findAll(); }

    public TableRest show(Long id) { return this.repositoryTable.findById(id).get(); }

    public TableRest create(TableRest tableRest){ return this.repositoryTable.save(tableRest); }

    public TableRest edit(TableRest tableRest){ return this.repositoryTable.save(tableRest); }

    public void delete(Long id){ this.repositoryTable.deleteById(id); }
}
