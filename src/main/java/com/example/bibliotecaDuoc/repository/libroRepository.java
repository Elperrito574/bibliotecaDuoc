package com.example.bibliotecaDuoc.repository;
import com.example.bibliotecaDuoc.model.libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class libroRepository {

    private List<libro> listaLibro = new ArrayList<>();

    public List<libro> obtenerlibro(){
        return listaLibro;
    }

    public libro buscarPorid(int id){
        for (libro libro: listaLibro){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    public libro buscarPorIsbn(String isbn){
        for (libro libro: listaLibro){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    public libro guardar(libro lib){
        listaLibro.add(lib);
        return lib;
    }

    public libro actualizar(libro lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaLibro.size(); i++){
            if(listaLibro.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }

        libro libro1 = new libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(libro1.getEditorial());
        libro1.setIsbn(libro1.getIsbn());

        listaLibro.set(idPosicion,libro1);
        return libro1;

    }


    public void eliminar(int id){
        libro libro = buscarPorid(id);
        if (libro != null) {
            listaLibro.remove(libro);
        }



    }

}
