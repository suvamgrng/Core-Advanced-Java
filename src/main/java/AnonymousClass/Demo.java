package AnonymousClass;

@FunctionalInterface
interface A {
    void add(int a, int b);
}


public class Demo {
    public static void main(String[] args) {

        //Anonymous class
        @SuppressWarnings("unused")
        A obj = (a , b) -> {
            System.out.println("Result: " + (a + b));
        };
        obj.add(3,6);
    }
}
