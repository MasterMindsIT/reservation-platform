package com.reservas.configrestaurant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConfigRestaurant extends JpaRepository<ConfigRestaurant, Long> {
}
