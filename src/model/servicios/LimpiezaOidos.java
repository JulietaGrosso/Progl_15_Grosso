package model.servicios;

import model.tiposMascotas.Mascota;

public class LimpiezaOidos implements Servicio{

  private Mascota mascota;
  public LimpiezaOidos(Mascota mascota){
    this.mascota = mascota;
  }

  @Override
  public void aplicarServicio() {
    System.out.println("Limpieza de oídos");
  }

  @Override
  public double calcularPrecio() {
     if(this.mascota.tipoMascota().equals("Perro")){
        return 2000;
      }
    return 1000;
  }
}
