package by.teachmeskills.yadevich.lesson17.task2;

import by.teachmeskills.yadevich.lesson17.task2.exception.LineEmptyException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/** Task 2 (optional)
 Get the day of the week by date.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the date in the format dd-MM-yyyy: ");
            String dateStr = scanner.nextLine();

            if (dateStr.isEmpty()) {
                throw new LineEmptyException("Date cannot be empty", 909);
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // преобразует строку в объект Date по определенному формату
            Date date = dateFormat.parse(dateStr); // преобразовывает строку с консоли в объект Date с нужным форматом
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);// объект с нужным форматом дня недели
            String dayOfWeek = dayFormat.format(date); // преобразовывает в строку формата дня недели
            System.out.println("Day of the week: " + dayOfWeek);
        } catch (ParseException e) {
            System.out.println("Invalid Date format.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
