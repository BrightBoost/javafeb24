package miniopdrachten;

public class StringMethods {
    public static int getStringLength(String str) {
        return str.length();
    }

    public static String multiplyStr(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getStringLength("Hello"));
        System.out.println(multiplyStr("bla", 3));
    }
}

