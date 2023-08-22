package structuralPatterns.adapter;
// clase que ya tengo.
public class MotorEconomico implements Motor{

  public MotorEconomico() {
    super();
    System.out.println("Creando motor económico");
  }

  @Override
  public void encender() {
    System.out.println("Encendiendo motor económico");
  }

  @Override
  public void acelerar() {
    System.out.println("Acelerando motor económico");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando motor económico");
  }
}
