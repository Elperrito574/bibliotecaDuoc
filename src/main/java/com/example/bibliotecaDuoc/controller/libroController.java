package com.example.bibliotecaDuoc.controller;

import com.example.bibliotecaDuoc.model.libro;
import com.example.bibliotecaDuoc.service.libroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/libros")
public class libroController {

    @Autowired
    private libroService libroService;

    @GetMapping
    public List<libro> listaLibros(){
        return libroService.getlibro();
    }

    @PostMapping
    public libro agregarLibro(@RequestBody libro Libro){
        return libroService.saveLibro(Libro);
    }

    @GetMapping("{id}")
    public libro buscarLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public libro actualizarLibro(@PathVariable int id, @RequestBody libro Libro){
        return libroService.updateLibro(Libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

}
