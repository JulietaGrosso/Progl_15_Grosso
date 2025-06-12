package model.tiposMascotas;

public class Gato extends Mascota{


  public Gato(String nombre, int edad, String raza, String comportamiento, double peso, double tamanio){
    super(nombre,edad,raza,comportamiento,peso,tamanio);

  }

  public String tipoMascota(){

    return "Gato";
  }


}
