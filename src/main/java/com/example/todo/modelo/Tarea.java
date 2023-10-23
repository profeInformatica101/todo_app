package com.example.todo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarea {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;

	    @Enumerated(EnumType.STRING)
	    private EstadoTarea status;
	    

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public EstadoTarea getStatus() {
			return status;
		}

		public void setStatus(EstadoTarea status) {
			this.status = status;
		}
	    
	    
}
