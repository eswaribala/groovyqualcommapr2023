package com.qualcomm.webstore.utilities

def skills={ int employeeId,String... skillSet->{
       skillSet.join(',')
       print "$employeeId=>$skillSet\n"
}}

skills(1234,"c","c++","java","ruby")
skills(1235,"c")
skills(1236)
skills(1234,'c','c++','java','ruby','groovy')