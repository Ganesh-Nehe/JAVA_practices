public class Program8 {
    public static void main(String[] args) {
        int day = 7;
        while (day >= 0) {
            if (day == 0) {
                System.out.println(day + " days assignment is overdue");
            } else {
                System.out.println(day + " days are remaining" + "\n" + ". .");
            }
            day--;
        }
    }
}
