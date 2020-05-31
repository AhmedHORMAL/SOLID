package dependencyinversion.example1;

public class MechanismLayer implements PolicyServiceInterface {

    private MechanismServiceInterface mechanismServiceInterface;

    public MechanismLayer(MechanismServiceInterface mechanismServiceInterface) {
        this.mechanismServiceInterface = mechanismServiceInterface;
    }

    @Override
    public String getData() {
        return mechanismServiceInterface.getTool();
    }
}
