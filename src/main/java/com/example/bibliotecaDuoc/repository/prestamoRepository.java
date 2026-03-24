package com.example.bibliotecaDuoc.repository;
import com.example.bibliotecaDuoc.model.libro;
import com.example.bibliotecaDuoc.model.prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class prestamoRepository {

    private List<libro> listaPrestamo = new ArrayList<>();

    public List<libro> obtenerPrestamo(){
        return listaPrestamo;
    }

    public libro buscarPorid(int id){
        for (libro libro: listaPrestamo){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }



}


