package calculator.controller;

import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    public void run() {
        String input = InputView.readInput();
        parseInput(input);
        int result = addNumbers();
        OutputView.printResult(result);
    }

    private int addNumbers() {

        return 0;
    }

    private void parseInput(String input) {

    }
}
