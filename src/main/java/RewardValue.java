public class RewardValue {

    double cash;
    String mile;
    public RewardValue(double cashValue) {
        cash=cashValue;
    }
    public RewardValue(String mileValue){
        mile = mileValue;
    }
    public double getMilesValue() {
        return cash*(1/0.0035);

    }

    public double getCashValue() {
        return  cash;
    }
}

