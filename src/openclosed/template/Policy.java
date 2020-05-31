package openclosed.template;

//TEMPLATE METHOD pattern: Base class is open and closed.
public abstract class Policy {
    public void policyFunction(){}

    abstract void serviceFunction();
}
