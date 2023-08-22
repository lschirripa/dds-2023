package structuralPatterns.adapter;
// clase distinta a mi interface Motor, entonces no la puedo hacer heredar de Motor. Voy a usar un adaptader.
public class MotorElectrico {

private boolean conectado = false;

  public MotorElectrico() {
    System.out.println("Creando motor electrico");
    this.conectado = false;
  }

  public void conectar() {
    System.out.println("Conectando motor electrico");
    this.conectado = true;
  }

  public void activar() {
    if (!this.conectado) {
      System.out.println("No se puede activar porque no está conectado el motor eléctrico");
    } else {
      System.out.println("Esta conectado, activando motor electrico");
    }
  }

  public void moverMasRapido() {
    if (!this.conectado) {
      System.out.println("No se puede mover rapido el motor eléctrico porque no está conectado el motor eléctrico");
    } else {
      System.out.println("Moviendo más rapido... aumentando voltaje");
    }
  }

  public void detener() {
    if (!this.conectado) {
      System.out.println("No se puede detener motor eléctrico porque no está conectado");
    } else {
      System.out.println("Deteniendo motor electrico");
    }
  }

  public void desconectar() {
    System.out.println("Desconectando motor electrico");
    this.conectado = false;
  }
}
