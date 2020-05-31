package dependencyinversion.example1;

public class PolicyLayer {

    private PolicyServiceInterface policyServiceInterface;

    public PolicyLayer(PolicyServiceInterface policyServiceInterface) {
        this.policyServiceInterface = policyServiceInterface;
    }

    public void printPolicy() {
        System.out.println(policyServiceInterface.getData());
    }
}
