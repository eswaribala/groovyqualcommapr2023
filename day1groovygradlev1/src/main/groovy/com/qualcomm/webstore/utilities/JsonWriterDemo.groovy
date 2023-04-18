package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.Order
import com.qualcomm.webstore.models.UserAccount

import java.time.LocalDate
def ordersMap=new Hashtable<Integer, Order>()


for(def count:1..100){
    ordersMap.put(count,new Order(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "Parameswari","BalaSubramaniam",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]),
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26))))

}

ordersMap.each {println(it.key)
    println(it.value)}
import groovy.json.JsonOutput
def productInfo=new JsonOutput().toJson(ordersMap)
prettyData=JsonOutput.prettyPrint(productInfo)
File file=new File('orders.json')
file.write(prettyData)
print "File Created"