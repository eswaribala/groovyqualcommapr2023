package com.qualcomm.webstore.utilities

println("Rocking with gradle!!!")
//method 1
println("Enter Product Id")
productId=System.in.newReader().readLine()
println "Product Id = ${productId}"

//method 2


def readln = javax.swing.JOptionPane.&showInputDialog

def expiryDate= readln 'Enter Expiry Date'

println "Expiry Date ${expiryDate}"

//method 3

