package day22_ArraysLoopsPractice;

import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
            for(int each:arr){
                System.out.println(each);
            }

        System.out.println("++++++++++++++");

            int [][] arr2D={{1,2,3}, {4,5,6}};

            for(int[] each1Darray :arr2D){
                for(int eachElement:each1Darray){
                    System.out.println(eachElement);
                }

            }

        System.out.println("++++++++++++++");

            char [][] ch2D={{'A','B'},{'C','D','E'}};

            for(char[]each1D :ch2D){
                //System.out.println(Arrays.toString(each1D));
                for(char eachElement: each1D){
                    System.out.println(eachElement);
                }
            }









    }


}
