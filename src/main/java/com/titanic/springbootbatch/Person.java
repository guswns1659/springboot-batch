package com.titanic.springbootbatch;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter
public class Person {

    private String lastName;
    private String firstName;

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }
}
