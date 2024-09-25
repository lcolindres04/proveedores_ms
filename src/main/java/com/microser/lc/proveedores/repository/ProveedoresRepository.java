package com.microser.lc.proveedores.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import com.microser.lc.proveedores.entity.Proveedores;

public interface ProveedoresRepository extends CrudRepository<Proveedores, UUID>{

}
