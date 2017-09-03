package com.example.demo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ksb on 2017. 9. 3..
 */
@Data
@Document
public class User {
    @Id
    private long id;
    private String email;
    private String name;
    private String password;
}
