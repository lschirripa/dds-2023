package behaviouralPatterns.strategy;

import strategy.Strategy;

//un main para probar, pero se deberia de ejecutar en el contexto
public class Main {
  //ejecutar contexto con estrategia A
  public static void main(String[] args) {
    behaviouralPatterns.strategy.Context contexto = new behaviouralPatterns.strategy.Context();
    Strategy estrategiaA = new behaviouralPatterns.strategy.ConcreteStrategyA();
    contexto.setStrategy(estrategiaA);
    contexto.strategy.executeFunc(5, 10);
  }
}
