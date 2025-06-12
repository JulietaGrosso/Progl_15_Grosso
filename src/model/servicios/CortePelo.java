package model.servicios;

import model.tiposMascotas.Mascota;

public class CortePelo implements Servicio{

  private Mascota mascota;
  public CortePelo(Mascota mascota){
    this.mascota = mascota;
  }



  @Override
  public void aplicarServicio() {
    System.out.println("Corte de pelo");
  }

  @Override
  public double calcularPrecio() {
    if(this.mascota.tipoMascota().equals("Perro")){
      return 5000;
    }
    return 1000;
  }
}
