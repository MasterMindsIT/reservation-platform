package com.reservas.sucursalschedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySchedule extends JpaRepository<Schedule, Long> {
}
