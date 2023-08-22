package structuralPatterns.adapter;
// Interfaz a la que ya tengo, y quiero que el adaptee se adapte a esta, ya que es completamente distinta y tiene otros metodos.
public interface Motor {

  public void encender();
  public void acelerar();
  public void apagar();

}
