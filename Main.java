import java.util.Scanner;
/**
 * state any index that the number is located at
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // create array with 10 spots
    int[] integers = new int[10];

    // ask user to enter ten numbers
    System.out.println("Please enter in 10 integers to put into the array");

    // put integers into array using loop
    for(int i = 0; i < integers.length; i++){
     integers[i] = input.nextInt();
    }
  
    // ask user to enter a number to find within array
    System.out.println("Please enter a number to find");
    int findNumber = input.nextInt();

    // create loop to find number chosen
    for(int i = 0; i < integers.length; i++){
      if(integers[i] == findNumber)
      System.out.println(findNumber + " is located at index " + i);
    }


  }
}

    
  

