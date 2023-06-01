package org.emp.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author prade on 31-05-2023
 */

@Document(collection = "Employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;
    private String name;
    private long age;
    private String company;
    private long salary;

}
