package com.qualcomm.webstore.facades

trait BankAccount {

    def balance(){ return new Random().nextInt(1000000)}

}