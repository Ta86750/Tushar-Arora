public class Program1 {

    public static double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        String operation = "add";

        double result = calculate(a, b, operation);
        System.out.println("Result: " + result);
    }
}
