package com.reservas.raiting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRaiting extends JpaRepository<Raiting, Long> {
}
