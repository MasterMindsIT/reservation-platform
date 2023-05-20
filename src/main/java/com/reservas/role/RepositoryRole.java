package com.reservas.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRole extends JpaRepository<Roles, Long> {
}
