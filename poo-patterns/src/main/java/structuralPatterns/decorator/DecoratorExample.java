package structuralPatterns.decorator;
// clase main para probar el patrón y decorar el cafe simple
public class DecoratorExample {
  public static void main(String[] args) {
    Coffee simpleCoffee = new SimpleCoffee();
    System.out.println("Café simple: " + simpleCoffee.getDescription() + ", Costo: $" + simpleCoffee.getCost());

    // Decoramos el café simple con leche y lo volvemos a imprimir
    Coffee milkCoffee = new MilkDecorator(simpleCoffee);
    System.out.println("Café con leche: " + milkCoffee.getDescription() + ", Costo: $" + milkCoffee.getCost());
  }
}
