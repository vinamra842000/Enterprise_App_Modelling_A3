package com.assignment.library.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String memberType;
    private LocalDate memberDate;
    private LocalDate expiryDate;
}
