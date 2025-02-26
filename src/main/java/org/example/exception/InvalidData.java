package org.example.exception;

public class InvalidData extends RuntimeException {
    private final String operationId;

    public String getOperationId() {
        return operationId;
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public InvalidData(String message, String operationId) {
        super(message);
        this.operationId = operationId;
    }
}
