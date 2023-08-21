package behaviouralPatterns.command.command.comandos;
import behaviouralPatterns.command.accesorios.Luz;
public class CommandLuzOn implements Command {
  Luz luz;

  public CommandLuzOn(Luz luz) {
    this.luz = luz;
  }

  @Override
  public void execute() {
    luz.encender();
  }

}