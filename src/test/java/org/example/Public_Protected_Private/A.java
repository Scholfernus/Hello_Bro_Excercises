package org.example.Public_Protected_Private;
import org.example.Public_Protected_Private_2.*;
public class A {
    protected String protectedMesage = "This is protected ";
    public static void main(String[] args) {

        C c = new C();
//        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
        B b = new B();
//        System.out.println(b.privateMessage);
        System.out.println(b.dostepDlaA);
    }
}
