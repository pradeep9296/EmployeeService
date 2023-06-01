package org.emp.service.exception;

import lombok.Data;

/**
 * @author prade on 01-06-2023
 */
@Data
public class EmployeeCreateException extends RuntimeException {
    private long responseCode;

    public EmployeeCreateException(long responseCode, String message) {
        super(message);
        this.responseCode = responseCode;
    }
}

