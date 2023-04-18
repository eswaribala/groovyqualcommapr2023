package com.qualcomm.webstore.facades

trait GSTAccount {

    def tax(){return new Random().nextInt(10000)}
}