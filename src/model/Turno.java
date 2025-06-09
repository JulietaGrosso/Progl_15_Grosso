package model;

import java.time.LocalDate;

public class Turno {
  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  private LocalDate fecha;


  Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha){
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;


  }

  public void confirmarTurno(){

  }

  public void mostrarDetalle(){

  }

}
