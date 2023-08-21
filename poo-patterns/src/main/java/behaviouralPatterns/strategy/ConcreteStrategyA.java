package behaviouralPatterns.strategy;

public class ConcreteStrategyA implements behaviouralPatterns.strategy.Strategy {

  public void executeFunc(int Num1, int Num2) {
    System.out.println("Ejecutando funcion A con los numeros: " + Num1 + " y " + Num2);
  }
}
