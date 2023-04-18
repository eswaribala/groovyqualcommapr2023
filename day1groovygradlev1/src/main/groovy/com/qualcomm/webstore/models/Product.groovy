package com.qualcomm.webstore.models

import groovy.transform.Canonical

import java.time.LocalDate

@Canonical class Product {
    long productId
    String description
    long cost
    int unit
    LocalDate dop

    Product(long productId, String description, long cost, int unit, LocalDate dop) {
        this.productId = productId
        this.description = description
        this.cost = cost
        this.unit = unit
        this.dop = dop
    }
}
