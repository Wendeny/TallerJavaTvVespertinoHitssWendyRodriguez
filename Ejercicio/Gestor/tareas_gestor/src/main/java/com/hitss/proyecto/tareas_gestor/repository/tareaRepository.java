package com.hitss.proyecto.tareas_gestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.proyecto.tareas_gestor.model.Tareas;

public interface tareaRepository extends JpaRepository <Tareas, Long> {

    
}
