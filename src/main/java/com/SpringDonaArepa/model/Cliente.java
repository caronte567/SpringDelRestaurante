package com.SpringDonaArepa.model;

//Clase para crear la entidad cliente del sistema

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @Column(nullable = false)
    private Long IdUser;

    @Column(nullable = false)
    private String NombreUser;

    @Column(nullable = false)
    private String Telefono;

    @Column(nullable = false)
    private Double Email;

}
