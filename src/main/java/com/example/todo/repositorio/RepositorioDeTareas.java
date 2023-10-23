package com.example.todo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.todo.modelo.EstadoTarea;
import com.example.todo.modelo.Tarea;

public interface RepositorioDeTareas extends JpaRepository<Tarea, Long> {
	// Aquí puedes definir métodos de consulta adicionales si los necesitas
    @Query("SELECT t FROM Tarea t WHERE t.status = ?1")
    List<Tarea> encontrarPorEstado(EstadoTarea estado);
	
    // List<Tarea> findByEstado(EstadoTarea estado);
}
/**
find, findBy, readBy, queryBy, getBy
*/