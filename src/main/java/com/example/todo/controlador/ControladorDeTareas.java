package com.example.todo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todo.modelo.EstadoTarea;
import com.example.todo.modelo.Tarea;
import com.example.todo.repositorio.RepositorioDeTareas;

@Controller
public class ControladorDeTareas {
	@Autowired
	RepositorioDeTareas repositorio;
	
	
	@GetMapping("/")
	public String index(Model model) {
		List<Tarea> tareas = repositorio.findAll();
		model.addAttribute("tareas", tareas);
		return "index";
	}
	
	@PostMapping("/agregarTarea")
	public String agregarTarea(@RequestParam String nombreTarea, Model model) {
		Tarea t = new Tarea();
		t.setName(nombreTarea);
		t.setStatus(EstadoTarea.PorHacer);
		
		repositorio.save(t);
		return "redirect:/";
	}

}
