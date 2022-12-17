package inheritance;

public class VIPCustomer extends Customer {

    private int saleRatio;
    private int agentID;


    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
    }

    public int getAgentID() {
        return agentID;
    }

}
