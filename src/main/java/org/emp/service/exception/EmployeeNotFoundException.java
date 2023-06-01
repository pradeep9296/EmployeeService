package org.emp.service.exception;

import lombok.Data;

/**
 * @author prade on 01-06-2023
 */
@Data
public class EmployeeNotFoundException  extends RuntimeException {
    private long responseCode;

    public EmployeeNotFoundException(long responseCode, String message) {
        super(message);
        this.responseCode = responseCode;
    }
}
