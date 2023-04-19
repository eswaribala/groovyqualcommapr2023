package day3

class Award {

    Date awardDate
    Integer points
    String type
     static  belongsTo = [customer:Customer]
    static constraints = {
    }
}
