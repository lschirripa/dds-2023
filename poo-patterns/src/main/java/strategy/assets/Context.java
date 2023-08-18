package strategy.assets;

public class Context {

  Strategy strategy;

  public void setStrategy(Strategy nuevaStrat) {
    strategy = nuevaStrat;
  }

  //ejecutar contexto con estrategia A
  public void main(String[] args) {
    Strategy estrategiaA = new ConcreteStrategyA();
    this.setStrategy(estrategiaA);
    this.strategy.executeFunc(5, 10);
  }

}