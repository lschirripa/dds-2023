package structuralPatterns.composite;

// Componente hoja
public class Leaf implements Component{
  @Override
  public void operation() {
    System.out.println("Operación en hoja");
  }

}
