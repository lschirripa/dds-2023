package structuralPatterns.adapter;

public class Aplicacion {

public static void main(String[] args) {
    Motor motorComun = new MotorComun();
    motorComun.encender();
    motorComun.acelerar();
    motorComun.apagar();

    Motor motorEconomico = new MotorEconomico();
    motorEconomico.encender();
    motorEconomico.acelerar();
    motorEconomico.apagar();

    Motor motorElectricoAdapter = new MotorElectricoAdapter();
    motorElectricoAdapter.encender();
    motorElectricoAdapter.acelerar();
    motorElectricoAdapter.apagar();
  }
}
