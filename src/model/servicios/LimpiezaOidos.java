package model.servicios;

public class LimpiezaOidos implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Limpieza de oídos");
  }

  @Override
  public double calcularPrecio() {
    return 2000;
  }
}
