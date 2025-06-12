package model;

import model.servicios.Servicio;
import model.tiposMascotas.Mascota;

import java.time.LocalDate;

public class Turno {
  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  private LocalDate fecha;
  private boolean turnoConfirmar;

  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha){
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;
    this.turnoConfirmar = false;

  }

  public void confirmarTurno(){
    this.turnoConfirmar = true;

  }

  public void mostrarDetalle(){
    System.out.println("");
    System.out.println("Turno de la mascota: " + this.mascota.getNombre());
    System.out.println("Precio del servicio: " + this.servicio.calcularPrecio());
    System.out.println("Estado del turno: " + (turnoConfirmar ? "Turno confirmado" : "Turno no confirmado") );
  }

}
