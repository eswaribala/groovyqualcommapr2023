package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.exceptions.NameException
import com.qualcomm.webstore.models.Address
import com.qualcomm.webstore.models.UserAccount

import java.time.LocalDate

class ExceptionDemo {

    def static void main(String... args){

        try {
            def userAccount = new UserAccount(new Random().nextInt(1000000), "Test@123",
                    LocalDate.of(1980 + new Random().nextInt(20), 1 + new Random().nextInt(10), 1 + new Random().nextInt(26)),
                    "Parameswari", "", [new Address(new Random().nextInt(10000), "8d", "Chennai", "TN", 600049)])
        }
        catch (NameException ex){
            println(ex.message)
        }
        finally {

        }
    }
}
