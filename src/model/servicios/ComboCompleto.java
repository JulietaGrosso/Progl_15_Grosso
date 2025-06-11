package model.servicios;

public class ComboCompleto implements Servicio{

  CortePelo corte;
  Banio ban;
  LimpiezaOidos limpieza;

  public ComboCompleto(){
    this.corte = new CortePelo();
    this.ban = new Banio();
    this.limpieza = new LimpiezaOidos();
  }

  @Override
  public void aplicarServicio() {
    System.out.println("Combo Completo");
    this.corte.aplicarServicio();
    this.ban.aplicarServicio();
    this.limpieza.aplicarServicio();
  }

  @Override
  public double calcularPrecio() {
    double precioCorte = this.corte.calcularPrecio();
    double precioBan = this.ban.calcularPrecio();
    double precioLimpieza = this.limpieza.calcularPrecio();
    return precioCorte + precioBan + precioLimpieza;
  }
}
