package day3

import org.springframework.format.annotation.DateTimeFormat

import java.time.LocalDate

class OnlineOrder {
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
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
