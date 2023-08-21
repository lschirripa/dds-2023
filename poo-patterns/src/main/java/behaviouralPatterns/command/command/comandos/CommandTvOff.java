package behaviouralPatterns.command.command.comandos;
import behaviouralPatterns.command.accesorios.Tv;
public class CommandTvOff implements Command {
  Tv tv;

  public CommandTvOff(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.off();
  }
}
