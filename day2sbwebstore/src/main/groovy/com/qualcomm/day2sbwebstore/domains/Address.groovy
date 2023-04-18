package com.qualcomm.day2sbwebstore.domains

import groovy.transform.Canonical

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ForeignKey
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name="Address")
class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Address_Id")
    Long addressId
    @Column(name="Door_No",nullable = false,length = 5)
    String doorNo
    @Column(name="City",nullable = false,length = 150)
    String city
    @Column(name="State",nullable = false,length = 50)
    String state
    @Column(name="ZipCode")
    Long zipCode
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "User_Id"), name = "User_Id")
    UserAccount userAccount

}
