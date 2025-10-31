package com.hitss.proyecto.tareas_gestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.proyecto.tareas_gestor.model.Tareas;
import com.hitss.proyecto.tareas_gestor.repository.tareaRepository;

@RestController
@RequestMapping("/api/tareas")
public class TareasController {

    @Autowired
    private tareaRepository tareaRepository;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Tareas> listarTareas() {
        return tareaRepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public Tareas crearTarea(@RequestBody Tareas tareas) {
        
        return tareaRepository.save(tareas);
    }
    

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<Tareas> obtenerTarea(@PathVariable Long id) {
        return tareaRepository.findById(id)
                                .map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Tareas> actualizarTareas(@PathVariable Long id, @RequestBody Tareas tareaActualizada) {
        
        return tareaRepository.findById(id)
                                .map(tarea -> {
                                    tarea.setTitulo(tareaActualizada.getTitulo());
                                    tarea.setCompletado(tareaActualizada.isCompletado());
                                    return ResponseEntity.ok(tareaRepository.save(tarea));
                                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id){
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
