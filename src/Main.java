public class Main {
    public static void getRandomNumber() {
        int random;
        int min = 1;
        int max = 100;

        random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random);
    }

    public static void getAbsoluteValue(double x) {
        System.out.println(Math.abs(x));
    }

    public static void getFactorial(int x) {
        int result = 1;
        for (int i = x; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void getWeatherForecast() {
        int timeID = (int) Math.floor(Math.random() * 3);
        int weatherID = (int) Math.floor(Math.random() * 4);
        String[] time = {"Today", "Tomorrow", "The day after tomorrow"};
        String[] weather = {"sunny", "cloudy", "rainy", "snowy"};

        System.out.println(time[timeID] + " will be " + weather[weatherID]);
    }

    public static void getRandomMessage(String name) {
        int id = (int) Math.floor(Math.random() * 3);
        ;
        String[] greetings = {"Good morning ", "Good afternoon ", "Good night "};

        System.out.println(greetings[id] + name);
    }

    public static void isEvenNumber(int x) {
        if (x % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void getMinValue(double a, double b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void isSameAbsoluteValue(int i, int j) {
        if (Math.abs(i) == Math.abs(j)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void getMessage(String name, boolean isKid) {
        if (isKid) {
            System.out.println("Halo Dek " + name);
        } else {
            System.out.println("Halo Pak " + name);
        }
    }

    public static void getSum(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void getAverage(double a, double b, double c) {
        System.out.println((a + b + c) / 3);
    }

    public static void main(String[] args) {
        getRandomNumber();
        getAbsoluteValue(-11);
        getFactorial(4);
        getWeatherForecast();
        getRandomMessage("Rafi");
        isEvenNumber(7);
        getMinValue(7,-7);
        isSameAbsoluteValue(7, -7);
        getMessage("Rafi", true);
        getSum(1,2,3);
        getAverage(1,2,3);
    }
}