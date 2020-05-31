package dependencyinversion.example1;

public class UtilityService implements MechanismServiceInterface {

    private String tool;

    @Override
    public String getTool() {
        return tool;
    }
}
