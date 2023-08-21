package behaviouralPatterns.command.command.dispositivo;

import behaviouralPatterns.command.accesorios.*;
import behaviouralPatterns.command.command.comandos.*;

public class Configuracion {

  public static void configurar(ControlInteligente ci) {
    Luz luz = new Luz();
    Tv tv = new Tv();

    // aca se setean los commandos de una manera dinamica, sin que el control inteligente lo sepa. Este archivo de config me lo permite y en cualq momento puedo setear otro comando.
    // si quiero cambiar el boton 1, simplemente cambio el comando que le asigno.
    ci.setBoton3(new CommandLuzOn(luz));
    ci.setBoton4(new CommandLuzOff(luz));
    ci.setBoton1(new CommandTvOn(tv));
    ci.setBoton2(new CommandTvOff(tv));

  }

}