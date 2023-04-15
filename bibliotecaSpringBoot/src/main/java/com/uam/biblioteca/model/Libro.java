package com.uam.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Libro")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name="Libro.all", query="select e from Libro e")
})
public class Libro {

    @Id
    @SequenceGenerator(name="libro_seq", sequenceName = "libro_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_seq")
    private Long id;
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    private Editorial editorial;
}

