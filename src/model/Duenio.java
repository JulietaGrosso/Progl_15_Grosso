package model;

public class Duenio {
  private String nombre;
  private String telefono;


Mascota mascotaArray[];
int contadorMascota;
public Duenio(String nombre, String telefono){
  this.nombre = nombre;
  this.telefono = telefono;
  this.mascotaArray = new Mascota[4];
  this.contadorMascota = 0;
}

  public String getNombre() {
    return nombre;
  }
  public String getTelefono() {
    return telefono;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }




  public void agregarMascota(Mascota mascota){
      mascotaArray[this.contadorMascota] = mascota;
      this.contadorMascota = contadorMascota + 1;
  }

  public void mostrarMascota(){
      for(Mascota mascota : this.mascotaArray){
        if(mascota != null){
          System.out.println("Mascota " + mascota.getNombre() + " Tipo " + mascota.tipoMascota());

        }
      }
  }
}
