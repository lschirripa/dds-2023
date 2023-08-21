package behaviouralPatterns.state;
// La clase estado base declara métodos que todos los estados
// concretos deben implementar, y también proporciona una
// referencia inversa al objeto de contexto asociado con el
// estado. Los estados pueden utilizar la referencia inversa
// para dirigir el contexto a otro estado.

// podria ser una interface, pero si quiero que tenga una referencia inversa al contexto, no puedo hacerlo con una interface.
// tendria que tener una clase abstracta intermedia para que puedan compartir ese atributo. (o cada clase concreta tenga el atributo contexto)
public abstract class State {
  protected AudioPlayer player;

  public void State(AudioPlayer player) {
    this.player = player;
  }

  public abstract void clickLock();

  public abstract void clickPlay();

  public abstract void clickNext();

  public abstract void clickPrevious();
}
