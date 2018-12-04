/**
 *This method purpose is to take in a array list and spit back out an average
 * of all the values given. If the values are negative or over 100, it's job is
 * to throw an exception.
 * @author SunnyPC
 *
 *
 * Pseudocode~~~~~~~~~~~~~~~~~~~~
 *Create a class that takes in an array of any number of elements, and calculate
 * the average of them all. After that create a range for the variables.
 * and if the elements exceed the range, throw an IllegalArgumentException
 * Print the answer
 *
 */
public class TestScores {

    public static int average(int[] a){
        int[] scores = a;
        int ave;
        int sum = 0;
        //run each element of the array through the formula
        for (int i = 0; i < scores.length; i++){
            //throw a exception so the score isn't out of the range.
            if(scores[i] < 0 || scores[i] > 100)
                throw new IllegalArgumentException("Score for test #"
                +(i+1)+" is out of range.");
        sum = sum + scores[i];
        //calculate sum
    }
        ave = sum / scores.length;
        //calculate average
        return ave;
    }

}