// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

package task2_4;

public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic("Bank");
        logic.addScoreList(new Score("Счет5",1000));
        logic.addScoreList(new Score("Счет3",0));
        logic.addScoreList(new Score("Счет1", 100));
        logic.addScoreList(new Score("Счет2",200));
        logic.addScoreList(new Score("Счет4", -20));

        logic.lockAndUnlock(); //Учитывает возможность блокировки/разблокировки счета.
        System.out.println();
        logic.getScore(); //реализовывет поиск счетов
        System.out.println();
        logic.getSortScores(); //сортирует счета
        System.out.println();
        logic.sumOfScores(); //считает сумму всех счетов
        System.out.println();
        logic.separateSumOfScores(); // считает сумму отрицательных и положительных по балансу счетов.
    }
}
