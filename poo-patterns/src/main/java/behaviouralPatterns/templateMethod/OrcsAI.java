package behaviouralPatterns.templateMethod;

// Las clases concretas tienen que implementar todas las
// operaciones abstractas de la clase base, pero no deben
// sobrescribir el propio método plantilla.
public class OrcsAI extends GameAI {

  // collectResources no se sobreescribe, se usa el de la clase abstracta
  @Override
  protected void buildStructures() {
    System.out.println("Construyendo estructuras");
  }

  @Override
  protected void buildUnits() {
    System.out.println("Construyendo unidades");
  }

  @Override
  protected void attack() {
    System.out.println("Atacando");
  }
}

