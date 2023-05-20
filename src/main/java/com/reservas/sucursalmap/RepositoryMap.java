package com.reservas.sucursalmap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMap extends JpaRepository<Maps, Long> {
}
