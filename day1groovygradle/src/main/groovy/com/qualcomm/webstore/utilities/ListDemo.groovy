package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.UserAccount
import java.time.LocalDate

def userAccounts=[new UserAccount(new Random().nextInt(1000000),"Test@123",
        LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
        "","",[new Address("1","8d","CHennai","TN",600049)]),
                  new UserAccount(new Random().nextInt(1000000),"Test@123",
                          LocalDate.of(1980+new  Random().nextInt(20), 1+new Random().nextInt(10), 1+ new Random().nextInt(26)),
                          "","",[new Address("2","16","Chennaii","TN",602024)])

]


//print
for(user in userAccounts)
    println "${user}"




