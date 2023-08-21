package behaviouralPatterns.state;

import behaviouralPatterns.state.State;

// También pueden disparar transiciones de estado en el
// contexto.
public class ReadyState extends State {

  public void clickLock() {
    player.changeState(new LockedState(player));
  }

  public void clickPlay() {
    player.startPlayback();
    player.changeState(new PlayingState(player));
  }

  public void clickNext() {
    player.nextSong();
  }

  public void clickPrevious() {
    player.previousSong();
  }
}
