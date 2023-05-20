package com.reservas.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient {
    @Autowired
    private final RepositoryClient repositoryClient;

    @Autowired
    public ServiceClient(RepositoryClient repositoryClient){ this.repositoryClient = repositoryClient; }

    public List<Client> list(){ return this.repositoryClient.findAll(); }

    public Client show(Long id){ return this.repositoryClient.findById(id).get();}

    public Client create(Client client){ return this.repositoryClient.save(client); }

    public Client edit(Client client) { return this.repositoryClient.save(client); }

    public void delete(Long id){ this.repositoryClient.deleteById(id); }
}
