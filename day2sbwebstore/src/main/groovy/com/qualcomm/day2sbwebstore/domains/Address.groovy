package com.qualcomm.day2sbwebstore.domains

import groovy.transform.Canonical

@Canonical class Address {

    Long addressId
    String doorNo
    String city
    String state
    Long zipCode

}
