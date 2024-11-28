package calculator;

import calculator.controller.CalculatorController;
import calculator.domain.Delimiters;
import calculator.service.DelimiterService;
import calculator.service.NumberService;

public class AppConfig {
    private CalculatorController calculatorController;
    private DelimiterService delimiterService;
    private NumberService numberService;
    private Delimiters delimiters;

    public CalculatorController calculatorController() {
        if (calculatorController == null) {
            calculatorController = new CalculatorController(delimiterService(), numberService());
        }
        return calculatorController;
    }

    public DelimiterService delimiterService() {
        if (delimiterService == null) {
            delimiterService = new DelimiterService(delimiters());
        }
        return delimiterService;
    }

    public NumberService numberService() {
        if (numberService == null) {
            numberService = new NumberService(delimiters);
        }
        return numberService;
    }

    public Delimiters delimiters() {
        if (delimiters == null) {
            delimiters = new Delimiters();
        }
        return delimiters;
    }
}
