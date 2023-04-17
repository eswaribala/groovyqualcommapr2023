package com.qualcomm.webstore.models
import com.qualcomm.webstore.models.UserAccount

import java.time.LocalDate
import groovy.transform.Canonical

import java.time.LocalDate
@Canonical class Order{

    UserAccount userAccount
    LocalDate dor
}
