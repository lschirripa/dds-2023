package behaviouralPatterns.command.command.dispositivo;
import behaviouralPatterns.command.command.comandos.Command;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ControlInteligente {
  private Command boton1;
  private Command boton2;
  private Command boton3;
  private Command boton4;

  // ya logramos desacoplar la logica entre mi control y mis accesorios.
  // El control inteligente no sabe si el boton es de una luz o de una tv, simplemente sabe que es un boton y que tiene un comando asociado (execute).

  public void clickBoton1() {
    boton1.execute();
  }

  public void clickBoton2() {
    boton2.execute();
  }

  public void clickBoton3() {
    boton3.execute();
  }

  public void clickBoton4() {
    boton4.execute();
  }
}
