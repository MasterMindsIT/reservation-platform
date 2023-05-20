package com.reservas.detailraiting;

import com.reservas.client.Client;
import com.reservas.client.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDetailRaiting {

    @Autowired
    private final RepositoryDetailRaiting repositoryDetailRaiting;

    @Autowired
    public ServiceDetailRaiting(RepositoryDetailRaiting repositoryDetailRaiting){ this.repositoryDetailRaiting = repositoryDetailRaiting; }

    public List<DetailRaiting> list(){ return this.repositoryDetailRaiting.findAll(); }

    public DetailRaiting show(Long id){ return this.repositoryDetailRaiting.findById(id).get();}

    public DetailRaiting create(DetailRaiting detailRaiting){ return this.repositoryDetailRaiting.save(detailRaiting); }

    public DetailRaiting edit(DetailRaiting detailRaiting) { return this.repositoryDetailRaiting.save(detailRaiting); }

    public void delete(Long id){ this.repositoryDetailRaiting.deleteById(id); }
}
