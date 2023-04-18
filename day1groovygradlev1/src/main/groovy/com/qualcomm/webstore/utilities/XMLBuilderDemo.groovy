package com.qualcomm.webstore.utilities



def builder = new groovy.xml.MarkupBuilder()
//builder. Root element name
builder.Projects {
    description 'Project and Employees of 10..15'
    for (project in 10..15) {
        //Project Sub Element Name
        Project (project: project, employee: new Random().nextInt(10000)) {
            for (j in 2..<project) {
                if (project % j == 0) {
                    //Team is sub element of Project
                    Team (value: j)
                }
            }
        }
    }
}