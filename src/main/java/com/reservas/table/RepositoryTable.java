package com.reservas.table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTable extends JpaRepository<TableRest, Long> {
}
