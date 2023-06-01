package org.emp.service.model;

import lombok.Getter;

/**
 * @author prade on 01-06-2023
 */
@Getter
public enum RESPONSE {

    EMPLOYEE_NOT_FOUND(2001, "Employee not found"),
    CANNOT_CREATE_EMPLOYEE(2002, "Cannot create employee");
    private int value;
    private String message;

    private RESPONSE(int value, String message) {
        this.value = value;
        this.message = message;
    }
}
