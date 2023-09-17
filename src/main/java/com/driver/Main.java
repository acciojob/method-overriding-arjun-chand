package com.driver;
public class Main {
    public static class A{
       public String meth(){
        return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";

        }
    }

    public static void main(String[] args) {
        B Bobj = new B();
        System.out.println(Bobj.meth());

       B obj1 = new B();
        System.out.println(obj1.meth());

    }
}