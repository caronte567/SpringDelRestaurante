package com.SpringDonaArepa.model;

//Clase para crear la entidad Menu del sistema

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Menu {
    @Id
    @Column(nullable = false)
    private Long IdUser;

    @Column(nullable = false)
    private String NombreUser;

    @Column(length = 500)
    private String Descripcion;

    @Column(nullable = false)
    private Double Precio;

    // Getters y Setters
    public Long getId() { return IdUser; }
    public void setId(Long id) { this.IdUser = id; }

    public String getNombre() { return NombreUser; }
    public void setNombre(String nombre) { this.NombreUser = nombre; }

    public String getDescripcion() { return Descripcion; }
    public void setDescripcion(String descripcion) { this.Descripcion = descripcion; }

    public Double getPrecio() { return Precio; }
    public void setPrecio(Double precio) { this.Precio = precio; }
}
