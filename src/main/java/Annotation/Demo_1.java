package Annotation;

@VeryImportant(times = 3)
class A {
    @ImportantString
    @SuppressWarnings("unused")
    String name;

    public A(String name) {
        this.name = name;
    }

    int number;
    @VeryImportant(times = 3)
    void show() {
        System.out.println("A in show");
    }
}

class B extends A {

    public B(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println("B in show");
    }
}
public class Demo_1 {
     public static void main(String[] args) {
         A obj = new B("Peter");
         obj.show();
    }
}
