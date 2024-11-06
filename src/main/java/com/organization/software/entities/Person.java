/**
 * Representa una entidad Person en el sistema.
 * 
 * <p>Esta clase se usa como parte del modelo de datos y está diseñada
 * para mapear una entidad de base de datos mediante JPA.</p>
 */
package com.organization.software.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;


@Entity
@Data
@EqualsAndHashCode(of = "id")  // Define identidad solo con 'id'
@ToString(exclude = "users")    // Evita recursión infinita excluyendo 'users' de toString
public class Person {
    @Id
    private Long id;               // Identificador único de la persona
    private String name;           // Nombre de la persona
    private String email;          // Correo electrónico de la persona

    @OneToMany(mappedBy = "person")
    private List<User> users;      // Lista de usuarios asociados a esta persona
}

