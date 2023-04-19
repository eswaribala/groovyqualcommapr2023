package day3

class OrderItem {

    Integer qty
    Long total
    static belongsTo = [onlineOrder:OnlineOrder, product:Product]

    static constraints = {
        qty()
        total()
    }
}
