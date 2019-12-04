package snail.oswald.eckel.chapter8;

class C1{
    public void m1(){
        System.out.println("C1.m1");
        this.m2();
    }

    public void m2(){
        System.out.println("C1.m2");
    }
}

class C2 extends C1{
    @Override
    public void m2() {
        System.out.println("C2.m2");
    }
}


public class TwoMethodClass {
    public static void main (String[]arg){
        C1 c1 = new C1();
        c1.m1();

        C2 c2 = new C2();
        c2.m1();

        C1 c12 = new C2();
        c12.m1();
    }
}
