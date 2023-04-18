package com.qualcomm.webstore.utilities



def builder = new groovy.xml.MarkupBuilder()
//builder. Root element name
builder.Employees {
    //description 'Project and Employees of 10..15'
    for (employee in 10..15) {
        //Project Sub Element Name
        Employee (employeeId: employee, projectId: new Random().nextInt(10000)) {
            for (j in 2..<employee) {
                if (employee % j == 0) {
                    //Team is sub element of Project
                    Benefit (value: j){
                        Welfare(value:j)
                    }
                }
            }
        }
    }
}
//check
//new File('out.xml').write(builder as String)