package com.qualcomm.day2sbwebstore.domains
import groovy.transform.Canonical
import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import java.time.LocalDate
@Entity
@Table(name="UserAccount")
class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_Id")
    Long userId
    @Column(name="Password",nullable = false,length = 15)
    String password
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name="DOB")
    LocalDate dob
    @Column(name="First_Name",nullable = false,length = 50)
    String firstName
    @Column(name="Last_Name",nullable = false,length = 50)
    String lastName


}
