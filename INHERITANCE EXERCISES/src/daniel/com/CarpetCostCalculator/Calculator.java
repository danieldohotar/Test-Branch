package daniel.com.CarpetCostCalculator;

public class Calculator {

    private Floor floor = new Floor(2.75, 4.0);
    private Carpet carpet = new Carpet(3.5);

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost (){
        double calculator = floor.getArea() * carpet.getCost();
        return calculator;
    }
}
