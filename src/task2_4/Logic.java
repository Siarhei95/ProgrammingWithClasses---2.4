package task2_4;

import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic {
    private String nameScore;
    private List<Score> scoresList = new ArrayList<>();
    Logic(String nameScore) {
        this.nameScore = nameScore;
    }

    public void addScoreList(Score score) {
        scoresList.add(score);
    }

    public List<Score> getScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String finder = scanner.next();
        List<Score> list = new ArrayList<>(scoresList);
        for (Score c : scoresList) {
            if (c.getScoreName().equals(finder)) {
                list.add(c);
                System.out.println("Information: "+c.getScoreName() + ", balance: " + c.getBalance());
            }
        }
        return list;
    }
    public List<Score> lockAndUnlock() {
        boolean lock = true;
        boolean unlock = false;
        List<Score> list = new ArrayList<>(scoresList);
        for (Score c : scoresList) {
            c.getBalance();
            list.add(c);
            if(c.getBalance()>0){
                System.out.println("Information about lock:   "+c.getScoreName() + ", balance: " + c.getBalance()+", "+lock);
            }else
                System.out.println("Information about unlock: "+c.getScoreName() + ", balance: " + c.getBalance()+", "+unlock);
        }
        return list;
    }

    public List<Score> getSortScores() {
        List<Score> list = new ArrayList<>(scoresList);
        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return o1.getScoreName().compareToIgnoreCase(o2.getScoreName());
            }
        });
        return list;
    }

    public List<Score> sumOfScores() {
        List<Score> list = new ArrayList<>(scoresList);
        int sum = 0;
        for (Score c : scoresList) {
            sum = sum + c.getBalance();
            list.add(c);
        }
        System.out.println("Total amount of all accounts: "+sum);
        return list;
    }

    public List<Score> separateSumOfScores() {
        List<Score> list = new ArrayList<>(scoresList);
        int sum1 = 0; //сумма положительных балансов
        int sum2 = 0; //сумма отрицательных балансов
        for (Score c : scoresList) {
            if(c.getBalance()>=0) {
                sum1 = sum1 + c.getBalance();
            }else{
                sum2 = sum2 + c.getBalance();
            }
            list.add(c);
        }
        System.out.println("Sum positive: "+sum1);
        System.out.println("Sum negative: "+sum2);
        return list;
    }
}
