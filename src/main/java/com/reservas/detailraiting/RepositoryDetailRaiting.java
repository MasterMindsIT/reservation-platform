package com.reservas.detailraiting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDetailRaiting extends JpaRepository<DetailRaiting, Long> {
}
