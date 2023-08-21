package behaviouralPatterns.command.command.comandos;
import behaviouralPatterns.command.accesorios.Luz;
public class CommandLuzOff implements Command {
  Luz luz;

  public CommandLuzOff(Luz luz) {
    this.luz = luz;
  }

  @Override
  public void execute() {
    luz.apagar();
  }

}
