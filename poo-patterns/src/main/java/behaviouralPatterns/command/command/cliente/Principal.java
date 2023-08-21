package behaviouralPatterns.command.command.cliente;

import behaviouralPatterns.command.command.dispositivo.Configuracion;
import behaviouralPatterns.command.command.dispositivo.ControlInteligente;

public class Principal {

  public static void main(String[] args) {

    ControlInteligente control = new ControlInteligente();

    Configuracion.configurar(control);

    control.clickBoton1();
    //control.clickBoton3();
    control.clickBoton2();
    //control.clickBoton4();


  }

}
