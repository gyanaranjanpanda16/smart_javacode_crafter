package com.gyanaranjan.ArrayProgram01.gyanaranjan;
class A {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalery() {
        return salary;
    }

    public void setSalery(int salery) {
        this.salary = salery;
    }

    A(int x) {
        System.out.println(x + x + x + x);
//    }
//    public A() {
//        System.out.println("hii");
//    }
    }
}
 class Test15 extends A {
     public Test15(int a){
         super(a);
         System.out.println(a+"value");
     }

//     a

     public static void main(String[] args) {
//         A a = new A();
         Test15 test15 = new Test15(10);
         test15.setName("gyana");
         test15.setSalery(5000);
         System.out.println("Here name is :"+test15.getName()+"  \nsalary is : "+test15.getSalery());

     }
    }


