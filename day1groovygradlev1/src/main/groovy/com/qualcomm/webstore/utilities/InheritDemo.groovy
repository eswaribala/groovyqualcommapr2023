package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.SeasonalProduct

import java.time.LocalDate

class InheritDemo {

    def static void main(String... args){

        def seasonalProduct=new SeasonalProduct(123,'Mango Juice',300,1, LocalDate.of(2023,4,1))
        seasonalProduct.offer=0.02f
        println "Product Description as ${seasonalProduct.description} "

    }
}
