package org.emp.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author prade on 01-06-2023
 */
@Document(collection = "database_sequences")
@Data
@NoArgsConstructor
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;
}
