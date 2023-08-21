package behaviouralPatterns.state;

public class PlayingState extends State{

  public void clickLock() {
    player.changeState(new LockedState(player));
  }

  public void clickPlay() {
    player.stopPlayback();
    player.changeState(new ReadyState(player));
  }

  public void clickNext() {
    player.nextSong();
  }

  public void clickPrevious() {
    player.previousSong();
  }
}
