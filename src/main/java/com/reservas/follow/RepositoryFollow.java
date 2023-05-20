package com.reservas.follow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFollow extends JpaRepository<Follow, Long> {
}
