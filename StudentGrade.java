/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 
import java.util.Scanner;
 
public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.print("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
         
        System.out.println("Total Marks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A");
            break;
        case 8:
            System.out.println("Grade : B");
            break;
        case 7:
            System.out.println("Grade : C");
            break;
        case 6:
            System.out.println("Grade : D");
            break;
        case 5:
            System.out.println("Grade : E");
            break;
         default:
            System.out.println("Grade : F");
            break;
        }
    }
}