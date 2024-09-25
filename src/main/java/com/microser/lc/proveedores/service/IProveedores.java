package com.microser.lc.proveedores.service;

import java.util.List;
import java.util.UUID;

import com.microser.lc.proveedores.entity.Proveedores;



public interface IProveedores {
	List<Proveedores> findAll();
	Proveedores save(Proveedores proveedores);
	Proveedores update(UUID id, Proveedores proveedores); 
    Integer deleteById(UUID id);
}


