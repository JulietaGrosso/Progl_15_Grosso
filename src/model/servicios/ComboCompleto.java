package model.servicios;

import model.tiposMascotas.Mascota;

public class ComboCompleto implements Servicio{

  CortePelo corte;
  Banio ban;
  LimpiezaOidos limpieza;


  public ComboCompleto(Mascota mascota){
    this.corte = new CortePelo(mascota);
    this.ban = new Banio(mascota);
    this.limpieza = new LimpiezaOidos(mascota);
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
