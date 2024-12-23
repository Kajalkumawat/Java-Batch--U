class A {// normal class convert parent class
    void show1() {
        System.out.println("A class method");
    }
}

class B extends A {// normal class convert into child class
    void show2() {
        System.out.println("B class method");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        //always make child class object 
        //B k through A ki property 
        B p = new B();
        p.show1();
        p.show2();
        //A k through B ki property 
        A k=new A();
       k.show1();
      // k.show2();
    }
}