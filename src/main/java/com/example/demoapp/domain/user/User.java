package com.example.demoapp.domain.user;

import com.example.demoapp.domain.Language;
import com.example.demoapp.domain.util.LanguageConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Integer id;

    private String username;

    private String email;



}
