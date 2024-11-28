package calculator;

import calculator.controller.CalculatorController;

public class AppConfig {
    public CalculatorController calculatorController() {
        return new CalculatorController();
    }
}
