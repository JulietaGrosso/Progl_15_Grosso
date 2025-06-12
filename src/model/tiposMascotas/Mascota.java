package model.tiposMascotas;

import java.util.UUID;

public abstract class Mascota {
  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  final String id;
  private double peso;
  private double tamanio;

  public Mascota(String nombre, int edad, String raza, String comportamiento, double peso, double tamanio){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.id = UUID.randomUUID().toString();
    this.peso = peso;
    this.tamanio = tamanio;
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
  public double getTamanio() {return tamanio;}

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
  public void setPeso(double peso) { this.peso = peso;}
  public void setTamanio(double tamanio) {this.tamanio = tamanio;}


  public String mostrarFicha(){
    return "Nombre: " +  nombre + "\n"
            + "ID: " +  id + "\n"
            + " Edad: " +  edad + "\n"
            + " Raza: " + raza + "\n"
            + "Comportamiento: " + comportamiento + "\n"
            + "Peso: " + peso + "\n"
            + "Tamaño: " + tamanio;
  }

  public String tipoMascota(){
    return "";
  }

}
