public class Main {
    public static void main(String[] args) {

        String str = "Sanzharbek";
        method(str);

        IntBinaryOperator<Integer, Integer> intBinaryOperator = (a, b) ->
                System.out.println(a + " * " + b + " = " + (a * b));
        intBinaryOperator.multiply(5, 10);
    }

    public static <T> void method(String name) {
        MyFunctionalInterface<String> myFunctionalInterface = (String s) -> System.out.println("My name is " + s);
        myFunctionalInterface.method(name);
    }
}