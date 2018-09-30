package pkg02_03_counting;

import java.util.Random;

/**
 * @author Euddy Valdez
 * 
 * Done from 
 * Java for total beginners - Easy-to-follow Java programming
 * By 
 * Duckademy IT courses
 * at
 * https://www.udemy.com/easy-to-follow-java-programming/
 */
public class Counting {
    
    public static void main(String[] args) {
        Random generator = new Random();
        int die = 0;
        int count = 0;
        while (die !=6){
            die = generator.nextInt(6)+1;
            System.out.println("The program rolled a: " +die);
            count++;
        }
        System.out.println("You rolled " + count + " times to get a 6");
    }
    
}
