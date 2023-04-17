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
def scanner =new Scanner(System.in)
println("Enter the cost")
def cost=scanner.nextInt()
scanner.nextLine()
println "Cost= ${cost}"

println cost.class.name

def description="""When an application has Groovy on the classpath 
and uses standard Java serialization mechanisms to communicate between servers, 
or to store local data, it is possible for an attacker to bake a special serialized object 
that will execute code directly when deserialized. 
All applications which rely on serialization and do not isolate the code which deserializes objects 
are subject to this vulnerability."""

println "${description}"
pattern=/
[a-zA-Z]*/

println "${pattern}"

def productId=new Random().nextInt(100).plus(1000)
println "ProductId = ${productId}"

def initChar='A'.minus(1)
println " initChar ${initChar}"

