package model;

import model.tiposMascotas.Mascota;

public class Duenio {
  private String nombre;
  private String telefono;

  private Mascota mascotaArray[];
  private int contadorMascota;
  private Turno turnosArray[];
  private int turnosContador;

  public Duenio(String nombre, String telefono){
  this.nombre = nombre;
  this.telefono = telefono;
  this.mascotaArray = new Mascota[4];
  this.contadorMascota = 0;
  this.turnosArray = new Turno[10];
  this.turnosContador = 0;
}

  public String getNombre() {
    return nombre;
  }
  public String getTelefono() {
    return telefono;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }




  public void agregarMascota(Mascota mascota){
      mascotaArray[this.contadorMascota] = mascota;
      this.contadorMascota = contadorMascota + 1;
  }

  public void mostrarMascota(){
    System.out.println("Mascotas del dueño " + getNombre());
      for(Mascota mascota : this.mascotaArray){
        if(mascota != null){
          System.out.println(" ");
          System.out.println("Mascota " + mascota.getNombre() + " Tipo " + mascota.tipoMascota());
          System.out.println(mascota.mostrarFicha());

        }
      }
  }

  public void agregarTurnos(Turno turnos){
    turnosArray[this.turnosContador] = turnos;
    this.turnosContador = turnosContador + 1;
  }

  public void mostrarTurnos(){
    System.out.println("Turnos del dueño " + getNombre());
    for(Turno turno : this.turnosArray){
      if(turno != null){
        turno.mostrarDetalle();

      }
    }
  }
}
