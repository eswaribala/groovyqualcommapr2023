package day3

class Award {

    Date awardDate
    Integer points
    String type
     static  belongsTo = [customer:Customer]
    static constraints = {
        awardDate(validator: {
            if (it?.compareTo(new Date()) < 0 ) {
                return false
            }
            return true
        })
        points(min:25,max:100)
        type(nullable: false,blank: false)
    }
}
