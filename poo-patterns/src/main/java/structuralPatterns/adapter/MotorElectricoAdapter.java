package structuralPatterns.adapter;

public class MotorElectricoAdapter implements Motor {

  private MotorElectrico motorElectrico;

  public MotorElectricoAdapter() {
    super();
    this.motorElectrico = new MotorElectrico();
    System.out.println("Creando motor eléctrico adaptado");
  }

  @Override
  public void encender() {
    System.out.println("Encendiendo motor eléctrico adaptado");
    this.motorElectrico.conectar();
    this.motorElectrico.activar();
  }

  @Override
  public void acelerar() {
    System.out.println("Acelerando motor eléctrico adaptado");
    this.motorElectrico.moverMasRapido();
  }

  @Override
  public void apagar() {
    System.out.println("Apagando motor eléctrico adaptado");
    this.motorElectrico.detener();
    this.motorElectrico.desconectar();
  }
}
