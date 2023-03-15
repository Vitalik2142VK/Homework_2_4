package hw.calculator.Homework_2_4;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор.</b>";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public String divide(int num1, int num2) {
        if (num2 == 0)
            return "На 0 делить нельзя!";
        else
            return num1 + " / " + num2 + " = " + ((float)num1 / num2);
    }
    public String allCalculation(int num1, int num2) {
        return plus(num1, num2) + "<br>" + minus(num1, num2) + "<br>" + multiply(num1, num2) + "<br>" + divide(num1, num2);
    }

}
