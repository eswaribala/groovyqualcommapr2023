package com.qualcomm.day2sbwebstore.repositories

import com.qualcomm.day2sbwebstore.domains.UserAccount
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserAccountRepo extends JpaRepository<UserAccount, Long>{
//JPA refers class and fields not table
    @Query("select userAccount from UserAccount userAccount where userAccount.firstName=:firstName")
    public List<UserAccount> findByName(@Param("firstName") String firstName);

}