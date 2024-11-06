/**
 * Representa una entidad Role en el sistema.
 * 
 * <p>Esta clase se usa como parte del modelo de datos y está diseñada
 * para mapear una entidad de base de datos mediante JPA.</p>
 */
package com.organization.software.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Data
@EqualsAndHashCode(of = "id") // Define identidad solo con 'id'
@ToString                     // Usa toString sin exclusiones
public class Role {
    @Id
    private Long id;           // Identificador único del rol
    private String name;       // Nombre del rol
    private String description;// Descripción del rol
}

