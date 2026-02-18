public class App {

    public static void main(String[] args) {
        double total = 0;
        int totalInputNums = 0;
        double mark = In.askInt("Enter mark:");
        while (mark != -1) {
            total += mark;
            totalInputNums++;
            mark = In.askInt("Enter mark:");
        }

        if (totalInputNums == 0) {
            System.out.println("No marks were entered.");
        } else {
            double averageMarks = total / totalInputNums;
            System.out.println("Total mark value = " + total);
            System.out.println("Total inputted marks = " + totalInputNums);
            System.out.println("Average mark = " + averageMarks);
        }
    }
}
