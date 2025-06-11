package model;

public class Gato extends Mascota{


  Gato(String nombre, int edad, String raza, String comportamiento, String id, double peso){
    super(nombre,edad,raza,comportamiento,id,peso);

  }

  public String tipoMascota(){
      return "Gato";
  }

  public void mostrarFicha(){

  }
}
