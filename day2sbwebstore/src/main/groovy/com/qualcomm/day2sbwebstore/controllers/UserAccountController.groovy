package com.qualcomm.day2sbwebstore.controllers

import com.qualcomm.day2sbwebstore.domains.UserAccount
import com.qualcomm.day2sbwebstore.services.UserAccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserAccountController {
    @Autowired
    UserAccountService userAccountService
    @PostMapping("/useraccounts")
    def ResponseEntity<?> saveUserAccount(@RequestBody UserAccount userAccount){
        UserAccount userObj=this.userAccountService.addUserAccount(userAccount)
        if(userObj!=null){
            return ResponseEntity.status(HttpStatus.OK).body(userObj)
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Not Created")
        }
    }
    @GetMapping("/useraccounts")
    def List<UserAccount> saveUserAccount(){
        return this.userAccountService.getAllUserAccounts()

    }
}
