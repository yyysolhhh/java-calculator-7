package calculator.exception;

public enum ExceptionMessages {
    INVALID_CHARACTER("잘못된 문자가 포함됨"),
    ;

    private final String messages;

    ExceptionMessages(String messages) {
        this.messages = messages;
    }
}
