package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days31=31;
        int days28=28;
        int days30=30;
        switch (month) {
            case (1):
                System.out.println(days31);
                break;
            case (2):
                System.out.println(days28);
                break;
            case (12):
                System.out.println(days31);
                break;
            case (3):
                System.out.println(days31);
                break;
            case (4):
                System.out.println(days30);
                break;
            case (5):
                System.out.println(days31);
                break;
            case (6):
                System.out.println(days30);
                break;
            case (7):
                System.out.println(days31);
                break;
            case (8):
                System.out.println(days31);
                break;
            case (9):
                System.out.println(days30);
                break;
            case (10):
                System.out.println(days31);
                break;
            case (11):
                System.out.println(days30);
                break;
            default:
                System.out.println("wrong number!");
                break;
        }

    }
}
