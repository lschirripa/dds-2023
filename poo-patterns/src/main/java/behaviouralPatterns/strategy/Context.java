package behaviouralPatterns.strategy;

public class Context {

  behaviouralPatterns.strategy.Strategy strategy;

  public void setStrategy(behaviouralPatterns.strategy.Strategy nuevaStrat) {
    strategy = nuevaStrat;
  }

  //ejecutar contexto con estrategia A
  public void main(String[] args) {
    behaviouralPatterns.strategy.Strategy estrategiaA = new ConcreteStrategyA();
    this.setStrategy(estrategiaA);
    this.strategy.executeFunc(5, 10);
  }

}