package daniel.com.CarpetCostCalculator;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost =(cost < 0) ? 0 : cost;
    }

    public double getCost(){
        cost = cost;
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
