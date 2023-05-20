package com.reservas.categorydish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategoryDish extends JpaRepository<CategoryDish, Long> {
}
