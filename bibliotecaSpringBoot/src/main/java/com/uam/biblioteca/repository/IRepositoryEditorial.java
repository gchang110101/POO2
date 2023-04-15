package com.uam.biblioteca.repository;

import com.uam.biblioteca.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryEditorial extends JpaRepository<Editorial, Long> {
}
