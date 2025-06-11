package model;

public abstract class Mascota {
  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  final String id;
  private double peso;


  public Mascota(String nombre, int edad, String raza, String comportamiento, String id, double peso){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.id = id;
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }
  public int getEdad() {
    return edad;
  }
  public String getRaza() {
    return raza;
  }
  public String getComportamiento() {
    return comportamiento;
  }
  public String getId() {
    return id;
  }
  public double getPeso() {return peso;}

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public void setRaza(String raza) {
    this.raza = raza;
  }
  public void setComportamiento(String comportamiento) {
    this.comportamiento = comportamiento;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }



  public void mostrarFicha(){
    System.out.println();
  }

  public String tipoMascota(){
    return "";
  }

}
