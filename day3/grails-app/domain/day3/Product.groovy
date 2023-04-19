package day3

class Product {

    Long productId
    String productName
    Integer cost
    static hasMany = [orderItems:OrderItem]

    static constraints = {
        productId()
        productName()
        cost()

    }
}
