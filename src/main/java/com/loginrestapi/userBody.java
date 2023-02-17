package com.loginrestapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class userBody {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
}
