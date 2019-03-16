public class Calculator {
    private int a;
    private int b;

    public static int addAToB(int a, int b) {
        return a + b;
    }

    public static int subtractAFromB(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator();

        int result = Calculator.addAToB(10, 5);
        System.out.println(result);
    }

}