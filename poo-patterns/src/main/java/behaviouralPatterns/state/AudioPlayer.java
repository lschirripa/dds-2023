package behaviouralPatterns.state;
// CLASE CONTEXTO

// La clase ReproductordeAudio actúa como un contexto. También
// mantiene una referencia a una instancia de una de las clases
// estado que representa el estado actual del reproductor de
// audio.
public class AudioPlayer {

  State state;
  Field UI, volume, playlist, currentSong;

  public AudioPlayer() {
    state = new ReadyState(this);

    // El contexto delega la gestión de entradas del usuario
    // a un objeto de estado. Naturalmente, el resultado
    // depende del estado que esté activo ahora, ya que cada
    // estado puede gestionar las entradas de manera
    // diferente.
    UI = new UserInterface();
    UI.lockButton.onClick(this.clickLock());
    UI.playButton.onClick(this.clickPlay());
    UI.nextButton.onClick(this.clickNext());
    UI.prevButton.onClick(this.clickPrevious());
  }

  // Otros objetos (los mismos estados concretos) deben ser capaces de cambiar el estado
  // activo del reproductor.

  // o simplemente @Setter con lombock
  public void changeState(State state) {
    this.state = state;
  }

  // Los métodos UI delegan la ejecución al estado activo.

  public void clickLock() {
    state.clickLock();
  }

  public void clickPlay() {
    state.clickPlay();
  }

  public void clickNext() {
    state.clickNext();
  }

  public void clickPrevious() {
    state.clickPrevious();
  }
}
