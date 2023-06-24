/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 
import java.util.Scanner;
 
public class Percentage_Grade_Check {

		// Store marks of all the subjects in an array
		int marks[] = { 25, 65, 46, 98, 78, 65 };

		// Max marks will be 100 * number of subjects
		int max_marks = marks.length * 100;

		// Initialize student's total marks to 0
		int total = 0;

		// Initialize student's grade marks to F
		char grade = 'F';

		// Traverse though the marks array to find the sum.
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}

		// Calculate the percentage.
		// Since all the marks are integer,
		// typecast the calculation to double.
		double percentage
			= (((double)(total) / max_marks) * 100);

		// Nested if else
		if (percentage >= 90) {
			grade = 'A';
			System.out.print(grade);
		}
		else {
			if (percentage >= 80 && percentage <= 89) {
				grade = 'B';
				System.out.print(grade);
			}
		}
			else {
				if (percentage >= 60 && percentage <= 79) {
					grade = 'C';
					System.out.print(grade);
				}
			}
				else {
					if (percentage >= 33 && percentage <= 59) {
						grade = 'D';
						System.out.print(grade);
					}
				}
					else {
						grade = 'F';
						System.out.print(grade);
					}
				}
			}
		}