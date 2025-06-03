package com.example.jwt_auth.model;

import jakarta.persistence.*;
import lombok.*;

//You can use Lombok Data to provide getters, setters, and constructors automatically
// It also adds: // toString(), equals(), and hashCode() methods
@Getter //Defines getters for all fields
@Setter //Defines setters for all fields
@NoArgsConstructor //Defines a no-args constructor 
                    //User(){}
@AllArgsConstructor //Defines a constructor with all fields
                    // User(Long id, String username, String password){}
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
}