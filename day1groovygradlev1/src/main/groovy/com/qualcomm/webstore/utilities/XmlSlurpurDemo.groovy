package com.qualcomm.webstore.utilities

import groovy.xml.XmlSlurper


def result=new XmlSlurper().parse(new File("feeddata.xml"))

println "${result.entry.content.properties.key}"
println "${result.entry.content.properties.message}"
println "${result.entry.content.properties.httpCode}"


def employeeResult=new XmlSlurper().parse(new File("out123.xml"))
//complete it
