package strategy.assets;
//un main para probar, pero se deberia de ejecutar en el contexto
public class Main {
  //ejecutar contexto con estrategia A
  public static void main(String[] args) {
    Context contexto = new Context();
    Strategy estrategiaA = new ConcreteStrategyA();
    contexto.setStrategy(estrategiaA);
    contexto.strategy.executeFunc(5, 10);
  }
}
