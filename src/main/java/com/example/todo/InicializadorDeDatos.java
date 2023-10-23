package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.todo.modelo.EstadoTarea;
import com.example.todo.modelo.Tarea;
import com.example.todo.repositorio.RepositorioDeTareas;
import com.example.todo.servicio.ServicioDeTareas;

import jakarta.annotation.PostConstruct;

@Component
public class InicializadorDeDatos {

    @Autowired
    private ServicioDeTareas servicioDeTareas;

    @PostConstruct
    public void init() {
        Tarea tarea1 = new Tarea();
        tarea1.setName("Tarea 1");
        tarea1.setStatus(EstadoTarea.PorHacer);
        servicioDeTareas.guardarTarea(tarea1);
        
        Tarea tarea2 = new Tarea();
        tarea2.setName("Tarea 2");
        tarea2.setStatus(EstadoTarea.Haciendo);
        servicioDeTareas.guardarTarea(tarea2);
        
        Tarea tarea3 = new Tarea();
        tarea3.setName("Tarea 3");
        tarea3.setStatus(EstadoTarea.Hecho);
        servicioDeTareas.guardarTarea(tarea3);
    }
}
