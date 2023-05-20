package com.reservas.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository<Client, Long> {
}
