package task2_4;

public class Score {
    private String scoreName;
    private int balance;

    public Score(String scoreName, int balance){
        this.scoreName = scoreName;
        this.balance = balance;
    }

    public String getScoreName() {
        return scoreName;
    }

    public int getBalance() {
        return balance;
    }
    public String toString() {
        return String.format("%d\t scoreName: %s\t balance: ", scoreName, balance);
    }
}
