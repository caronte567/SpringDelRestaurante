package com.SpringDonaArepa.model;

//Clase para crear la entidad pedidos del sistema

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Pedidos {
    @Id
    @Column(nullable = false)
    private Long idUser;

    @Column(nullable = false)
    private String Cliente;

    @Column(nullable = false)
    private Double Total;

    @Column(nullable = false, updatable = false)
    private LocalDateTime Fecha;

    @PrePersist
    public void prePersist() {
        this.Fecha = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return idUser; }
    public void setId(Long id) { this.idUser = id; }

    public String getCliente() { return Cliente; }
    public void setCliente(String cliente) { this.Cliente = cliente; }

    public Double getTotal() { return Total; }
    public void setTotal(Double total) { this.Total= total; }

    public LocalDateTime getFecha() { return Fecha; }
}

