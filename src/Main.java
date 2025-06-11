import model.Duenio;
import model.Mascota;
import model.Perro;
import model.Turno;
import model.servicios.Banio;
import model.servicios.Servicio;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
//Crear algunos dueños, mascotas, turnos y servicios.

    Duenio duenio1 = new Duenio("Sandra", "34825555");
    Mascota johnny = new Perro("Johnny", 10, "Policia", "tranquilo", "a", 60.50);
    Servicio banio = new Banio();
    Turno turno1 = new Turno(johnny, duenio1, banio, LocalDate.of(2025, 06, 06));
    duenio1.agregarMascota(johnny);

    // Mensajes:
    duenio1.mostrarMascota();
    banio.aplicarServicio();
    System.out.println("Precio del servicio: " + banio.calcularPrecio());

  }
}