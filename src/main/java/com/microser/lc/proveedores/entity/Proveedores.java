package com.microser.lc.proveedores.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Entity
@Table(name = "proveedores")
@NoArgsConstructor
@AllArgsConstructor
public class Proveedores {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(columnDefinition = "VARCHAR(36)")
	    private UUID id;

	    @Column(nullable = false, length = 100)
	    private String nombre;

	    @Column(nullable = false, length = 200)
	    private String direccion;

	    @Column(nullable = false, length = 15)
	    private String telefono;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
	    
	    
}

