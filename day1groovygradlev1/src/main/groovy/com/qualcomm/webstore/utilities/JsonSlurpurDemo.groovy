package com.qualcomm.webstore.utilities

import groovy.json.JsonSlurper


def users=new JsonSlurper().parse(new File("users.txt"))

users.each {println "User Id = ${it.id}, email= ${it.email}, city=${it.address.city}"}