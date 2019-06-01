public class Lambda {
    public static void main (String[] args) {
        System.out.println(calculate(2.3, 2.6, "SUM"));            //4.9
        System.out.println(calculate(2.7, 10, "MUL"));             //27.0
        System.out.println(calculate(27, 2, "SUB"));               //25.0
        System.out.println(calculate(2, 4, "EXP"));                //16.0
        System.out.println(calculate(15, 7.5, "DIV"));             //2.0
        System.out.println(calculate(5, 2, "ABRAKADABRA"));        //0.0
    }

    @FunctionalInterface
    interface MathOperation {
        double operate(double a, double b);
    }
    private static double calculate(double a, double b, String operation){
        MathOperation add = Double::sum;
        MathOperation subtract = (val1, val2) -> val1 - val2;
        MathOperation multiply = (val1, val2) -> val1 * val2;
        MathOperation divide = (val1, val2) -> val1 / val2;
        MathOperation exponentiate = Math::pow;

        switch(operation) {
            case "SUM":
                return add.operate(a, b);
            case "SUB":
                return subtract.operate(a, b);
            case "MUL":
                return multiply.operate(a, b);
            case "EXP":
                return exponentiate.operate(a, b);
            case "DIV":
                return divide.operate(a, b);
        }
        return 0.0;
    }

}

