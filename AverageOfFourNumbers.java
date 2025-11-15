//* John Kadzuwa 
  * NCE/ME/SCI/012/25

  *This program is going to run or excute the average of four numbers.


import java.util.Scanner; 

public class AverageOfFourNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("ikani number yoyamba:");
        double num1 = scanner.nextDouble(); 

        System.out.println("number iwili:");
        double num2 = scanner.nextDouble(); 

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble(); 

        System.out.println("Enter the fourth number:");
        double num4 = scanner.nextDouble();  

        double sum = num1 + num2 + num3 + num4;

        double average = sum / 4;

        System.out.println("kugawa ma number four mofafana: " + average);

        scanner.close(); 
    }
}
