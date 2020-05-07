package com.occamsrazor.web.admin;

import lombok.Data;
import org.springframework.stereotype.Component;


import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
@Data
public class Admin {
    private String  employNumber, passwd ,name ,
            position, profile, email, phoneNumber,
            registerDate;


    @Override
    public String toString() {

        return String.format("%s,%s,%s,%s,%s,%s,%s,%s," ,
                "employNumber,passwd,name,position,profile,email,phoneNumber,registerDate");
    }
}