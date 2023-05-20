package com.reservas.state;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryState extends JpaRepository<States, Long> {

}
