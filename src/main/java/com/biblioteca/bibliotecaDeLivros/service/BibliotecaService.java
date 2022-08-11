package com.biblioteca.bibliotecaDeLivros.service;

import com.biblioteca.bibliotecaDeLivros.model.LivrosModel;
import com.biblioteca.bibliotecaDeLivros.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;


    public List<LivrosModel> mostrarLivros(){
        return bibliotecaRepository.findAll();
    }

    public LivrosModel cadastrarLivro(LivrosModel livrosModel){

        livrosModel.getNomeDoLivro();
        livrosModel.getNomeDoAutor();
        livrosModel.getDataDeLancamento();
        livrosModel.getCodigoDoLivro();

        return bibliotecaRepository.save(livrosModel);
    }
}
