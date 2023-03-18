package org.example.Public_Protected_Private_2;
import org.example.Public_Protected_Private.*;


public class Asub extends A {
    public static void main(String[] args) {
//        C c = new C();
//        System.out.println(c.defaultMessage);
        Asub asub = new Asub();
        System.out.println(asub.protectedMesage);
    }
}
