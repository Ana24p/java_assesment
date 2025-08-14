package PRActical_extrawork;

public class MyNumber {
    private int number;

    MyNumber() {
        this.number = 0;
    }

    MyNumber(int number) {
        this.number = number;
    }

    boolean isPositive() {
        return this.number > 0;
    }

    boolean isNegative() {
        return this.number < 0;
    }

    boolean isOdd() {
        return this.number % 2 != 0;
    }

    boolean isEven() {
        return this.number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int value = Integer.parseInt(args[0]);
        MyNumber num = new MyNumber(value);

        System.out.println("Number: " + value);
        System.out.println("Positive: " + num.isPositive());
        System.out.println("Negative: " + num.isNegative());
        System.out.println("Odd: " + num.isOdd());
        System.out.println("Even: " + num.isEven());
    }
}
