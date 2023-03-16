package hw.calculator.Homework_2_4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор.</b>";
    }

    @GetMapping(path = "/plus" )
    public String plus(@RequestParam("num_1") int num1,@RequestParam("num_2") int num2) {
        return num1 + " + " + num2 + " = " + calculateService.plus(num1, num2);
    }

    @GetMapping(path = "/minus" )
    public String minus(@RequestParam("num_1") int num1,@RequestParam("num_2") int num2) {
        return num1 + " - " + num2 + " = " + calculateService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply" )
    public String multiply(@RequestParam("num_1") int num1,@RequestParam("num_2") int num2) {
        return num1 + " * " + num2 + " = " + calculateService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide" )
    public String divide(@RequestParam("num_1") int num1,@RequestParam("num_2") int num2) {
        if (num2 == 0)
            return "На 0 делить нельзя!";
        else
            return num1 + " / " + num2 + " = " + calculateService.divide(num1, num2);
    }
}
