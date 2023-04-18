package com.qualcomm.day2sbwebstore.services

import com.qualcomm.day2sbwebstore.domains.UserAccount
import com.qualcomm.day2sbwebstore.repositories.UserAccountRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserAccountService {
    @Autowired
    UserAccountRepo userAccountRepo
    //crud
    //insert
    def addUserAccount(UserAccount userAccount){
           return this.userAccountRepo.save(userAccount)
    }

    //select all

    def getAllUserAccounts(){
        return this.userAccountRepo.findAll()
    }

    //select by id
    def getUserAccountById(long userId){
        return this.userAccountRepo.findById(userId).orElse(null)
    }

    def getUserAccountByName(String firstName){
        return this.userAccountRepo.findByName(firstName)
    }
    def deleteUserAccountById(long userId){
        boolean status=false;
        if(getUserAccountById(userId)!=null){
            this.userAccountRepo.deleteAllById(userId)
            status=true
        }
        return status
    }



}
