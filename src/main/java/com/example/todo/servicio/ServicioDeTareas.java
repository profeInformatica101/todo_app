package com.example.todo.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.modelo.Tarea;
import com.example.todo.repositorio.RepositorioDeTareas;

@Service
public class ServicioDeTareas {

    @Autowired
    private RepositorioDeTareas repositorioDeTareas;

    public Tarea guardarTarea(Tarea tarea) {
        return repositorioDeTareas.save(tarea);
    }
}
