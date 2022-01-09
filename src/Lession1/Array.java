package Lession1;

import org.testng.annotations.Test;

/*
Find the max number of Array
 */
public class Array {
    int[] number = {5,8,15,60,10};
    @Test
    public void TC_05() {
        int sum =0;
        for (int i=0; i<number.length; i++) {
            sum+=number[i];
        }
        System.out.println("Sum all number = "+ sum);
        System.out.println("Avarage all number = "+ sum/number.length);
    }
}
