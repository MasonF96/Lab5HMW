/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class Arrayquestion1 {
    public static void print(int[] array,int n)
   {
        for(int i=0; i<array.length; i++)
        {
            if (array[i]>n)
                System.out.println(array[i]);
        }
   }

  
    public static void main(String[] args)
    {
        int[] array1 = {1,5,10,2,4,-3,6};
        int num1=3;
        print(array1,num1);
      
        int[] array2 = {10, 12, 15, 24};
        int num2 = 12;
        print(array2, num2);
    }
}
