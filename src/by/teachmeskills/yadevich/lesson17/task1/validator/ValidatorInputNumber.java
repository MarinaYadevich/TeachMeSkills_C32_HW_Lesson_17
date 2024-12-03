package by.teachmeskills.yadevich.lesson17.task1.validator;

import by.teachmeskills.yadevich.lesson17.task1.exception.InvalidInputNumberException;

public class ValidatorInputNumber {

    public static boolean validateInputNumber(int number) throws InvalidInputNumberException {

        if(number <= 0 || number > 2) {
            throw new InvalidInputNumberException("Invalid number.", 303);
        }
        return true;
    }
}
