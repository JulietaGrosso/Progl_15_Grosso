package model.servicios;

import model.tiposMascotas.Mascota;

public class Banio implements Servicio {

  private Mascota mascota;
  public Banio(Mascota mascota){

    this.mascota = mascota;
  }

  @Override
  public void aplicarServicio() {

    System.out.println("Baño");
  }

  @Override
  public double calcularPrecio() {
    if(this.mascota.tipoMascota().equals("Perro")){
      return 4000;
    }
    return 3000;
  }
}
