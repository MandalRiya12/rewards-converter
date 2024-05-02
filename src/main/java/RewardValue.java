public class RewardValue {

    double cash;
    int mile;
    public RewardValue(double cashValue) {
        cash=cashValue;
    }
    public RewardValue(int mileValue){
        mile = mileValue;
    }
    public double getMilesValue() {
        return cash*(1/0.0035);

    }

    public double getCashValue() {
        return  mile*0.0035;
    }
}

