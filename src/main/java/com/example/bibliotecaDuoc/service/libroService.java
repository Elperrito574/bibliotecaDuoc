package com.example.bibliotecaDuoc.service;

import com.example.bibliotecaDuoc.model.libro;
import com.example.bibliotecaDuoc.repository.libroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class libroService {

    @Autowired
    private libroRepository libroRepository;

    public List<libro> getlibro(){
        return libroRepository.obtenerlibro();
    }

    public libro saveLibro(libro Libro){
        return libroRepository.guardar(Libro);
    }

    public libro getLibroId(int id){
        return libroRepository.buscarPorid(id);
    }

    public libro updateLibro(libro Libro){
        return libroRepository.actualizar(Libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "producto eliminado" ;
    }

}


