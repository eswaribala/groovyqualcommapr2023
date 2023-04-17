package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.UserAccount
import java.time.LocalDate

def userAccounts=[]



//range of users
for(count in 1 .. 5){
    userAccounts.add(new UserAccount(new Random().nextInt(1000000),"Test@123",
            LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
            "","",[new Address(new Random().nextInt(10000),"8d","Chennai","TN",600049)]))
}


//print
for(user in userAccounts)
    println "${user}"




