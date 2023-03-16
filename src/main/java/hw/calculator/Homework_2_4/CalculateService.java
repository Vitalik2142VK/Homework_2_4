package hw.calculator.Homework_2_4;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public float divide(int num1, int num2) {
        return (float)num1 / num2;
    }
}
