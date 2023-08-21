package behaviouralPatterns.templateMethod;

//clase que contendra el template method

// La clase abstracta define un método plantilla que contiene un
// esqueleto de algún algoritmo compuesto por llamadas,
// normalmente a operaciones primitivas abstractas. Las
// subclases concretas implementan estas operaciones, pero dejan
// el propio método plantilla intacto.
public abstract class GameAI {

  public void turn() {
    collectResources();
    buildStructures();
    buildUnits();
    attack();
  }

  // Algunos de los pasos se pueden implementar directamente
  // en una clase base.
  protected void collectResources(){
    System.out.println("Recolectando recursos");
  }

  // Y algunos de ellos pueden definirse como abstractos.
  protected abstract void buildStructures();
  protected abstract void buildUnits();
  protected abstract void attack();
}
