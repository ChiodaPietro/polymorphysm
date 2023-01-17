package Genre;

// final in a variable is a constant
// final in a class, it can't be extended
// final in a method, it can't change, can't override

public class Main {
    public static void main(String[] args) {
        PrintString ps= new PrintString("hiiii");
        Printer<String> p = new Printer<>("soss");
        Printer<Integer> p1= new Printer<>(new Integer(100));
        System.out.println(p1.getT());
        Dog d = new Dog("bruhh", 22);
        Printer<Dog> p2= new Printer<>(d);
        Dog d1= p2.getT();
        System.out.println(d1.getAll());
    }
}
