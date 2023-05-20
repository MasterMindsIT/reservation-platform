package com.reservas.autority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAuthority extends JpaRepository<Authority,Long> {
}
