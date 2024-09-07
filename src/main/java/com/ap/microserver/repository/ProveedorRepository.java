package com.ap.microserver.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.ap.microserver.entity.Proveedor;

public interface ProveedorRepository extends MongoRepository<Proveedor, String> {
}
