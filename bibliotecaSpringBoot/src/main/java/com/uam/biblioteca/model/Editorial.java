package com.uam.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="EDITORIAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editorial {
    @Id
    @SequenceGenerator(name="editorial_seq",
            sequenceName = "editorial_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editorial_seq")
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "editorial", cascade =CascadeType.ALL,
    fetch = FetchType.LAZY)
    private List<Libro> detalles;
}
