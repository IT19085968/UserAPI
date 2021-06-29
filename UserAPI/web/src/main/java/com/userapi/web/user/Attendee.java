package com.userapi.web.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendee {
    @Id
    private String id;
    private String Name;
    private String Email;
    private int ContactNumber;
    private String Password;
    private String PaymentMethod;
    private int Amount;
    private String conferenceId;

}