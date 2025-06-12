package model.tiposMascotas;

public class Perro extends Mascota{


  public Perro(String nombre, int edad, String raza, String comportamiento, double peso, double tamanio){
    super(nombre, edad, raza, comportamiento, peso, tamanio);

  }

  @Override
  public String tipoMascota(){
      return "Perro";
  }


}
