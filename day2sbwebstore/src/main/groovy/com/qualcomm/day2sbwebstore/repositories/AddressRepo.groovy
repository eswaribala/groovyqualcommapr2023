package com.qualcomm.day2sbwebstore.repositories

import com.qualcomm.day2sbwebstore.domains.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepo extends JpaRepository<Address,Long> {

}