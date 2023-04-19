package day3

class OnlineOrder {

    Date orderDate
    Long orderNo
    Integer orderTotal
    static belongsTo = [customer:Customer]
    static hasMany = [orderItems:OrderItem]
    static constraints = {
        orderNo()
        orderDate(validator: {
            if (it?.compareTo(new Date()) < 0 ) {
                return false
            }
            return true
        })

        orderTotal()
    }
}