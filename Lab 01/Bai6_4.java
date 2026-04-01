import java.util.Scanner;

public class Bai6_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month = -1;
        int year = -1;

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = keyboard.nextLine().trim();
            month = getMonth(monthInput);

            System.out.print("Enter year: ");
            String yearInput = keyboard.nextLine().trim();
            
            try {
                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {
                year = -1;
            }

            if (month != -1 && year >= 0) {
                break;
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
        
        keyboard.close();
    }

    private static int getMonth(String input) {
        String[][] months = {
            {"January", "Jan.", "Jan", "1"},
            {"February", "Feb.", "Feb", "2"},
            {"March", "Mar.", "Mar", "3"},
            {"April", "Apr.", "Apr", "4"},
            {"May", "May", "May", "5"},
            {"June", "June", "Jun", "6"},
            {"July", "July", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"September", "Sept.", "Sep", "9"},
            {"October", "Oct.", "Oct", "10"},
            {"November", "Nov.", "Nov", "11"},
            {"December", "Dec.", "Dec", "12"}
        };

        for (int i = 0; i < 12; i++) {
            for (String s : months[i]) {
                if (input.equalsIgnoreCase(s)) return i + 1;
            }
        }
        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}