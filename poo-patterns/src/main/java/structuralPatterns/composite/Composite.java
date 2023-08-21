package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Componente compuesto o contenedor
public class Composite implements Component {
  private List<Component> children = new ArrayList<>();

  public void add(Component component) {
    children.add(component);
  }

  public void remove(Component component) {
    children.remove(component);
  }

  // Operación recursiva sobre los hijos del componente compuesto o contenedor
  @Override
  public void operation() {
    System.out.println("Operación en componente compuesto");
    for (Component child : children) {
      child.operation();
    }
  }
}