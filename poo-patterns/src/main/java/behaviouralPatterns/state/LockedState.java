package behaviouralPatterns.state;
// Los estados concretos implementan varios comportamientos
// asociados a un estado del contexto.
public class LockedState extends State{
  // Cuando desbloqueas a un jugador bloqueado, puede asumir
  // uno de dos estados.

  public void clickLock() {
    if (player.playing) {
      player.changeState(new PlayingState(player));
    } else {
      player.changeState(new ReadyState(player));
    }
  }

  public void clickPlay() {
    // No hacer nada.
  }

  public void clickNext() {
    // No hacer nada.
  }

  public void clickPrevious() {
    // No hacer nada.
  }
}
