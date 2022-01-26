package lesson2.GeekBrains;




public class HomeWork2 {

    private static int f;

    public static void main(String[] args) {
        ResetTwoNumer(1, 9);
        System.out.println(ResetTwoNumer(1, 9));
        NumberZero();
        ReturnNumberOne(666);
        System.out.println(ReturnNumberOne(666));
        MetodFor();

    }

    public static boolean ResetTwoNumer(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void NumberZero() {
        int x = 12;
        if (x < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean ReturnNumberOne(int z) {
        if (z <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void MetodFor() {            // я так и не понял как правильно написать условие, что бы строка применилась указанное количество раз :(
        String srt = "Boston";
        int y = 2;
        for (int y = 2; String srt = 2; srt = y;)
            System.out.println(srt);
    }
}
















