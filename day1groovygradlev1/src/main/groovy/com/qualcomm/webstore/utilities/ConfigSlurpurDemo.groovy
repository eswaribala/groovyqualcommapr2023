package com.qualcomm.webstore.utilities

def config = new ConfigSlurper().parse(new File("db.properties").toURL())

def properties = config.toProperties()

println "${properties.'app.date'}"
println "${properties.'app.age'}"
println "${properties.'app.port'}"