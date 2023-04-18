package com.qualcomm.webstore.utilities

import groovy.xml.XmlSlurper


def result=new XmlSlurper().parse(new File("feeddata.xml"))

println "${result.entry.content.properties.key}"