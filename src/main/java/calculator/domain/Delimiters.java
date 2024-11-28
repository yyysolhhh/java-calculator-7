package calculator.domain;

import java.util.List;

public class Delimiters {
    private List<String> delimiters;

    public Delimiters() {
        this.delimiters = List.of(",", ":");
    }

    public void addDelimiter(String delimiter) {
        validate(delimiter);
        delimiters.add(delimiter);
    }

    private void validate(String delimiter) { // TODO

    }
}
