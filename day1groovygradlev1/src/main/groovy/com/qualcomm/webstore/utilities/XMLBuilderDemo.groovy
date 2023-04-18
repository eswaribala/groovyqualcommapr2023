package com.qualcomm.webstore.utilities


def writer = new StringWriter()
def builder = new groovy.xml.MarkupBuilder(writer)
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
new File('employees.xml').write(writer as String)

