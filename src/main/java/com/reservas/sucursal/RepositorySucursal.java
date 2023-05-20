package com.reservas.sucursal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySucursal extends JpaRepository<Sucursal, Long> {
}
