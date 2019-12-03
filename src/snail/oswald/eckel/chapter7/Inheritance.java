package snail.oswald.eckel.chapter7;

class A{
    A(){
        System.out.println("A");
    }

    A(int i){
        System.out.println("A." + i);
    }
}

class B{
    B(){
        System.out.println("B");
    }

    B(int i){
        System.out.println("B." + i);
    }
}

class C extends A{
    B b = new B();

    C(int i){
        System.out.println("C." + i);
    }

    C(int i, char c){
        super(i);
        System.out.println("C." + i + "." + c);
    }
}

public class Inheritance {
    public static void main(String[] argv) {
        C c = new C(1);
        System.out.println();
        C c1 = new C(1, 'd');
    }
}
