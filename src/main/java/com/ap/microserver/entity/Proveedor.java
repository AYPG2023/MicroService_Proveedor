package com.ap.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "proveedores")
@Data
public class Proveedor {

    @Id
    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
}