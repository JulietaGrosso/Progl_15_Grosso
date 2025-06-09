package model;

public class Banio implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Baño");
  }

  @Override
  public double calcularPrecio() {
    return 3000;
  }
}
