package com.qualcomm.webstore.models

import com.qualcomm.webstore.exceptions.NameException
import groovy.transform.Canonical

import java.time.LocalDate

@Canonical class UserAccount {
    Long userId
    String password
    LocalDate dob
    String firstName
    String lastName
    List<Address> addressList

    UserAccount(Long userId, String password, LocalDate dob, String firstName, String lastName, List<Address> addressList) {
        this.userId = userId
        this.password = password
        this.dob = dob
        def namePattern= ~/[a-zA-Z]{5,25}/
        if(!namePattern.matcher(firstName).matches())
            throw new NameException("First Name cannot be blank or not in the range of 5 to 25")
        this.firstName = firstName
        if(!namePattern.matcher(lastName).matches())
            throw new NameException("Last Name cannot be blank or not in the range of 5 to 25")
        this.lastName = lastName
        this.addressList = addressList
    }
}
