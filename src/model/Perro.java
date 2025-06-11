package model;

public class Perro extends Mascota{


  public Perro(String nombre, int edad, String raza, String comportamiento, String id, double peso){
    super(nombre, edad, raza, comportamiento, id, peso);

  }

  @Override
  public String tipoMascota(){
      return "Perro";
  }
  @Override
  public void mostrarFicha(){

  }
}
