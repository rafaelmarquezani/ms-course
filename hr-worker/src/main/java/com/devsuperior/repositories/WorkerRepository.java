package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
