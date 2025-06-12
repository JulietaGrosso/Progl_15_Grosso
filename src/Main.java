import model.Duenio;
import model.servicios.ComboCompleto;
import model.servicios.LimpiezaOidos;
import model.tiposMascotas.Gato;
import model.tiposMascotas.Mascota;
import model.tiposMascotas.Perro;
import model.Turno;
import model.servicios.Banio;
import model.servicios.Servicio;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    //Dueños:
    Duenio duenio1 = new Duenio("Sandra", "3482555555");
    Duenio duenio2 = new Duenio("Maxi", "3482333333");
    Duenio duenio3 = new Duenio("Julieta", "34827777");



    //Mascotas:
    Mascota johnny = new Perro("Johnny", 10, "Policia", "tranquilo",  60.50, 1.60);
    Mascota zepelin = new Gato ("Zapelin", 12, "Smoking", "tranquilo",  5, 0.70);
    Mascota leia = new Gato ("Leia", 4, "Angora", "tranquilo", 7, 0.80);
    Mascota donato = new Gato ("Donato", 5, "Orange tabby", "inquieto", 6, 0.70);

    duenio1.agregarMascota(johnny);
    duenio1.agregarMascota(zepelin);
    duenio2.agregarMascota(leia);
    duenio3.agregarMascota(donato);

    //Servicios:
    Servicio comboJohnny = new ComboCompleto(johnny);
    Servicio limpiezaZepelin = new LimpiezaOidos(zepelin);
    Servicio banioLeia = new Banio(leia);
    Servicio banioDonato = new Banio(donato);

    //Turno:
    Turno turno1 = new Turno(johnny, duenio1, comboJohnny, LocalDate.of(2025, 06, 06));
    Turno turno2 = new Turno(zepelin, duenio1, limpiezaZepelin, LocalDate.of(2025, 06, 07 ));
    Turno turno3 = new Turno(leia, duenio2, banioLeia, LocalDate.of(2025, 06, 8 ));
    Turno turno4 = new Turno(donato, duenio3, banioDonato, LocalDate.of(2025, 06, 11 ));


    turno2.confirmarTurno();
    duenio1.agregarTurnos(turno1);
    duenio1.agregarTurnos(turno2);
    duenio2.agregarTurnos(turno3);
    duenio3.agregarTurnos(turno4);

    // Mensajes:
    duenio1.mostrarMascota();
    duenio1.mostrarTurnos();
    comboJohnny.aplicarServicio();





  }
}