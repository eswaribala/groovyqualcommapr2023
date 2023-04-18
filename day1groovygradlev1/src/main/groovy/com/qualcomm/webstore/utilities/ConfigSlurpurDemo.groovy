package com.qualcomm.webstore.utilities

def config = new ConfigSlurper().parse('''
    app.date = new Date()
    app.age  = 42
    app {
        dbname="webstoredb"
        port=8080
        drivername="com.java.sql.jdbcDriver"
    }
''')

def properties = config.toProperties()

println "${properties.'app.date'}"
println "${properties.'app.age'}"
println "${properties.'app.port'}"