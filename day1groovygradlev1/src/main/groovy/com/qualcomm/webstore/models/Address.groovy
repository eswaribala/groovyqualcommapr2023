package com.qualcomm.webstore.models

import groovy.transform.Canonical

@Canonical class Address {

    Long addressId
    String doorNo
    String city
    String state
    Long zipCode

}
