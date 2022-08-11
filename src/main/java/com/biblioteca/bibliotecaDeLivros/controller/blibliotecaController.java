package com.biblioteca.bibliotecaDeLivros.controller;

import com.biblioteca.bibliotecaDeLivros.model.LivrosModel;
import com.biblioteca.bibliotecaDeLivros.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class blibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping(path = "/biblioteca")
    public List<LivrosModel> buscarLivros(){
        return bibliotecaService.mostrarLivros();
    }

    @PostMapping(path = "/biblioteca")
    @ResponseStatus(HttpStatus.CREATED)
    public LivrosModel adicionarLivro(@RequestBody LivrosModel livrosModel){
        return bibliotecaService.cadastrarLivro(livrosModel);
    }

}
