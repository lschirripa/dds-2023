//ejemplo de patron strategy

public class Strategy {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();
        context = new Context(new ConcreteStrategyB());
        context.executeStrategy();
        context = new Context(new ConcreteStrategyC());
        context.executeStrategy();
    }
}

interface Strategy {
    void execute();
}

class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Called ConcreteStrategyA.execute()");
    }
}

class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Called ConcreteStrategyB.execute()");
    }
}

class ConcreteStrategyC implements Strategy {
    public void execute() {
        System.out.println("Called ConcreteStrategyC.execute()");
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

// Path: poo-patterns/src/main/java/TemplateMethod.java


