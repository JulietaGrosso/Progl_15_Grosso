package model.servicios;

public class CortePelo implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Corte de pelo");
  }

  @Override
  public double calcularPrecio() {
    return 5000;
  }
}
