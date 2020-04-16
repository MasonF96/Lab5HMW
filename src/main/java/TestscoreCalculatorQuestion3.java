/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class TestscoreCalculatorQuestion3 {
     private double[] scores;
   double sum = 0;

   // Constructor of class.
   public TestscoreCalculatorQuestion3(double array[]) {
      
       // Start the for loop
       for (int i = 0; i < array.length; i++) {
           scores = new double[array.length];
           // Check the condition.
           if (array[i] < 0 || array[i] > 100) {
               // Throw exception.
               throw new IllegalArgumentException(
                      
                       "Bad scores" + "\n\tInvalid score found." + "\n\tElement: " + i + " Score: " + array[i]);
           } else {
               // Assign value.
               scores[i] = array[i];
               sum += array[i];
           }
       }
   }

   // Definition of the method.
   public double getAverage() {
       return sum / scores.length;
   }
}
// Declare a class.

/**
 *
 * @author mason
 */
 class TestScoresDemo {
   public static void main(String[] args) throws Exception {
       // Declare an array.
       double[] badScores = { 97.5, 66.7, 88.0, 101.0, 99.0 };
       double[] goodScores = { 97.5, 66.7, 88.0, 100.0, 99.0 };
       TestScores test_Score = null;
       // Start the try block.
       try {
           test_Score = new TestScores(badScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       // Start the try block.
       try {
           test_Score = new TestScores(goodScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       // Display the result on console.
       System.out.print("Good scores" + "\n\tThe average of the good scores is " + test_Score.getAverage());
   }
}
