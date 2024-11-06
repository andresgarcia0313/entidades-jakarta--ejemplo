/**
 * Representa una entidad User en el sistema.
 * 
 * <p>Esta clase se usa como parte del modelo de datos y está diseñada
 * para mapear una entidad de base de datos mediante JPA.</p>
 */
package com.organization.software.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;


@Entity
@Data
@EqualsAndHashCode(of = "id")            // Define identidad solo con 'id'
@ToString(exclude = {"person", "roles"}) // Evita recursión infinita excluyendo 'person' y 'roles' de toString
public class User {
    @Id
    private Long id;                        // Identificador único del usuario
    private String username;                // Nombre de usuario
    private String password;                // Contraseña del usuario

    @ManyToOne
    private Person person;                  // Persona asociada al usuario

    @ManyToMany
    private List<Role> roles;               // Roles asignados al usuario
}

