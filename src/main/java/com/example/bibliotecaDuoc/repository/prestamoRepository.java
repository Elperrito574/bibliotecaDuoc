package com.example.bibliotecaDuoc.repository;
import com.example.bibliotecaDuoc.model.libro;
import com.example.bibliotecaDuoc.model.prestamo;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class prestamoRepository {

    private List<prestamo> listaPrestamo = new ArrayList<>();

    public List<prestamo> obtenerPrestamo(){
        return listaPrestamo;
    }

    public prestamo buscarPorid(int id){
        for (prestamo prestamo: listaPrestamo){
            if (prestamo.getId_Prestamo() == id){
                return prestamo;
            }
        }
        return null;
    }

    public prestamo guardarPrestamo(prestamo lib){
        listaPrestamo.add(lib);
        return lib;
    }

    public prestamo actualizarPrestamo(prestamo lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaPrestamo.size(); i++){
            if(listaPrestamo.get(i).getId_Prestamo() == lib.getId_Prestamo()){
                id = lib.getId_Prestamo();
                idPosicion = i;
            }
        }

        prestamo Prestamo1 = new prestamo();
        Prestamo1.setId_Prestamo(id);
        Prestamo1.setId_Libro(id);
        Prestamo1.setRun_Cliente(lib.getRun_Cliente());
        Prestamo1.setFecha_Solicitud(LocalDate.now());
        Prestamo1.setCantidad_Dia(lib.getCantidad_Dia());
        Prestamo1.setFecha_Entrega(Prestamo1.getFecha_Solicitud().plusDays(Prestamo1.getCantidad_Dia()));
        Prestamo1.setMultas(lib.getMultas());

        listaPrestamo.set(idPosicion,Prestamo1);
        return Prestamo1;

    }


}


