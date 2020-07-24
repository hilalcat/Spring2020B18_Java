package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

         */

       // 10/3 ==> //3 with a remainder of 1
        //10-3-3-3

        int a=20;
        int b=3;

        if (b == 0) {
            System.out.println("Divisor cant be zero");
            System.exit(0);
        }


        int count=0; //count the execution of the loop

        while(a>=b){
            a-=b;
            count++;
        }

        if(a==0){
            System.out.println("The result is "+ count);
        }else{
            System.out.println("The result is "+count+" with a remainder of "+a);
        }







    }
}
