public class DayOfWeekUsing12 {
    public static void main(String[] args) {
        System.out.println("Day is : " + getDayOfWeek(1));
    }

    private static String getDayOfWeek(int dayNum) {
        return switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }
}
