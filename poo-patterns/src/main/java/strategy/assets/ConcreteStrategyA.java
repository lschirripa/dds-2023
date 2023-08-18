package strategy.assets;

public class ConcreteStrategyA implements Strategy {

  public void executeFunc(int Num1, int Num2) {
    System.out.println("Ejecutando funcion A con los numeros: " + Num1 + " y " + Num2);
  }
}
