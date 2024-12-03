package by.teachmeskills.yadevich.lesson17.task1;

import by.teachmeskills.yadevich.lesson17.task1.exception.InvalidInputNumberException;
import by.teachmeskills.yadevich.lesson17.task1.operation.MyFunc1;
import by.teachmeskills.yadevich.lesson17.task1.validator.ValidatorInputNumber;

import java.util.Scanner;

/** Task 1.
 * Create a generalized functional interface.
 * Write a class with one method.
 * In this method, implement the logic:
 * - if the number 1 is entered into the console, then: use the interface with a string type and
 * - pass the logic of reversing the string (outputting the string in reverse order) to the interface method.
 *
 * - if the number 2 is entered into the console, then: use the interface with an integer type and
 * - pass the logic of finding the factorial of a number to the interface method.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number 1(reverse) or 2(factorial): ");
            int number = scanner.nextInt();

            ValidatorInputNumber.validateInputNumber(number);

            if(number ==1) {
                MyFunc1<String> func;
                func = (str) -> {
                    String strReverse = new StringBuilder(str).reverse().toString();
                    return strReverse;
                };
                scanner.nextLine(); // загуглила это (очистить остаточный символ новой строки)
                System.out.print("Enter the line: ");
                String str = scanner.nextLine();
                System.out.println("Reverse: " + func.test(str));

            } else if(number ==2) {
                MyFunc1<Integer> func;
                func = (a) -> {
                    int factorial = 1;
                    for (int i = 1; i <= a; i++) {
                        factorial *= i;
                    }
                    return factorial;
                };
                System.out.print("Enter a number to find the factorial: ");
                int numberInput = scanner.nextInt();
                System.out.println("Factorial number " + numberInput + " : " + func.test(numberInput));
            }
        }catch(InvalidInputNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input format: " + e.getMessage());
        }
    }
}