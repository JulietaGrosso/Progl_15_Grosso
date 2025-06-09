package model;

public class ComboCompleto implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Combo Completo");
  }

  @Override
  public double calcularPrecio() {
    return 9000;
  }
}
