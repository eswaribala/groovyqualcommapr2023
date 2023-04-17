package com.qualcomm.webstore.models

import groovy.transform.Canonical

import java.time.LocalDate

@Canonical class UserAccount {
    Long userId
    String password
    LocalDate dob
    String firstName
    String lastName
    List<Address> addressList

}
