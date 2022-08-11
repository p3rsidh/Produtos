package com.biblioteca.bibliotecaDeLivros.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "biblioteca")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDoLivro;

    @Column(length = 100, nullable = false)
    private String nomeDoLivro;

    @Column(length = 100, nullable = false)
    private String nomeDoAutor;

    @Column(length = 100)
    private String dataDeLancamento;





}
