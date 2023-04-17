package com.qualcomm.webstore.models

import groovy.transform.Canonical

@Canonical class Address {

    String addressId
    String doorNo
    String city
    String state
    Long zipCode

}
