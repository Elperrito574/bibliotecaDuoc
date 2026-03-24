package com.example.bibliotecaDuoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class prestamo {

    private int id_Prestamo;
    private int id_Libro;
    private String run_Cliente;
    private LocalDate fecha_Solicitud;
    private LocalDate fecha_Entrega;
    private int cantidad_Dia;
    private int multas;

}
