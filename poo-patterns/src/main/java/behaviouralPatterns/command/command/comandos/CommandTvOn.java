package behaviouralPatterns.command.command.comandos;
import behaviouralPatterns.command.accesorios.Tv;
public class CommandTvOn implements Command {

  Tv tv;

  public CommandTvOn(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.on();
  }

}