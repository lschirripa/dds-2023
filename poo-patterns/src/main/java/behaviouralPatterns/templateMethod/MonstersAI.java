package behaviouralPatterns.templateMethod;

public class MonstersAI extends GameAI{

  //aca se sobreescribe el metodo collectResources de la clase abstracta
  @Override
  protected void collectResources(){
    System.out.println("Recolectando recursos sobreescribiendo el metodo de la clase abstracta");
  }

  @Override
  protected void buildStructures() {
    System.out.println("Construyendo estructuras de monstruos");
  }

  @Override
  protected void buildUnits() {
    System.out.println("Construyendo unidades monstruosas");
  }

  @Override
  protected void attack() {
    System.out.println("Atacando con monstruos");
  }


}
