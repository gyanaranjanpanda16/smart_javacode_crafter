package com.gyanaranjan.TestingJavaPrgram;


class Refer{

}
 class Test07 extends Refer{
    Refer ref;


     private Test07(Refer ref) {
         this.ref = new Refer();
     }
     static  void m12(){
          final int a;
         a=1;
         System.out.println(a);
//         a=12;
     }

     public static void main(String[] args) {
         Refer refer = new Refer();
         Test07 test07 = new Test07(refer);
         if(refer instanceof Refer){
             float a =10.7f;
             float b = 0/0f;
             System.out.println("hii"+b);
         }
         System.out.println(test07.ref);
         System.out.println(test07);
         System.out.println(refer);
         m12();
     }
}
