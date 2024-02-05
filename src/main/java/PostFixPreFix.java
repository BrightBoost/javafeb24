public class PostFixPreFix {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x;
        System.out.println("x:" + x + " y:" + y);

        int year = 2023;
        boolean isLeapYear = year % 4 == 0;
    }
}
