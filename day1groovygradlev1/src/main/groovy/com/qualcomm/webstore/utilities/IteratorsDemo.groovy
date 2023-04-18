package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.Order
import com.qualcomm.webstore.models.UserAccount

import java.time.LocalDate

def ordersMap=[:]


for(count in 1 .. 5){
    ordersMap.put(count,new Order(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "Parameswari","Balasubramaniam",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]),
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26))))
}

ordersMap.each {
    println(it.key)
    println(((Order)it.value).getDor())
    println(((Order)it.value).getUserAccount().getUserId())
}

ordersMap.each { entry -> println "Key: $entry.key, Value: $entry.value" }

ordersMap.each { key, val ->
    println "Key: $key , Value: $val"
}

ordersMap.eachWithIndex { entry, index ->
   // def indent = ((index == 0 || index % 2 == 0) ? "   " : "")
    println "Index: $index, Key: $entry.key, Value: $entry.value"
}





List<UserAccount> userAccounts=new ArrayList<UserAccount>()
//range of users
for(count in 1 .. 5){
    userAccounts.add(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "Parameswari","Balasubramaniam",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]))
}

userAccounts.each {println "${it}"}
userAccounts.eachWithIndex {it,index->println "${index},${it}"}

Iterator itr= userAccounts.iterator()

while(itr.hasNext()){

    println(itr.next())
}
