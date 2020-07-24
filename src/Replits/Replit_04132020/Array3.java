package Replits.Replit_04132020;
import java.util.Scanner;
public class Array3 {
            /*
            Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
            If no consecutive 5s or no 5s are detected in your code then print false.

                nums → [1, 5, 5, 1, 1] → true
                nums → [1, 8, 5, 5, 0] → true
                nums → [1, 5, 4, 1, 5] → false
                nums → [1, 4, 4, 1, 99] → false
             */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==5 && nums[i+1]==5){
                count++;
            }
        }

        if(count>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }






    }
}