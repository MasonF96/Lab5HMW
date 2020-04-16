
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class TestscoresQuestion2 {
    public static void main(String[] args) {

final int ARRAY_SIZE = 5;

int[] numbers = new int[ARRAY_SIZE];

getValues(numbers);

getTotal(numbers);

getAverage(numbers);

getHighest(numbers);

getLowest(numbers);

}

public static int getTotal(int[] x) {

int total = 0;

for (int index = 0; index < x.length; index++) {

total += x[index];

}

System.out.println("The total is " + total);

return total;

}

public static double getAverage(int[] x) {

int total = 0;

for (int index = 0; index < x.length; index++) {

total += x[index];

}

double average = (total / 2.0);

System.out.println("The average is " + average);

return average;

}

public static int getHighest(int[] x) {

int highest = x[0];

for (int index = 1; index < x.length; index++) {

if (x[index] > highest)

highest = x[index];

}

System.out.println("The highest value is " + highest);

return highest;

}

public static int getLowest(int[] x) {

int lowest = x[0];

for (int index = 1; index < x.length; index++) {

if (x[index] < lowest)

lowest = x[index];

}

System.out.println("The lowest value is " + lowest);

return lowest;

}

private static void getValues(int[] array) {

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter a series of " + array.length + " numbers.");

for (int index = 0; index < array.length; index++) {

System.out.print("Enter number " + (index + 1) + ": ");

array[index] = keyboard.nextInt();

}

}
}
