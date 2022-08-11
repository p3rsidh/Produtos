package com.biblioteca.bibliotecaDeLivros.repository;

import com.biblioteca.bibliotecaDeLivros.model.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<LivrosModel, Long> {
}
