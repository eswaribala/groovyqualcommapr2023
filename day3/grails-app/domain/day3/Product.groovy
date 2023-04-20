package day3

import grails.rest.Resource

//@Resource(uri='/api/products', formats=['json', 'xml'])
class Product {

    Long productId
    String productName
    Integer cost

    Product(Long productId, String productName, Integer cost) {
        this.productId = productId
        this.productName = productName
        this.cost = cost
    }
/*Product(version, id, Long productId, String productName, Integer cost) {
        this.version = version
        this.id = id
        this.productId = productId
        this.productName = productName
        this.cost = cost
    }*/
    static hasMany = [orderItems:OrderItem]
    /*static mapping = {
        //version false
      //  table 'product'
       // id column: 'productId', generator:'native', params:[sequence:'order_seq']
    }*/
    static constraints = {
        productId()
        productName()
        cost()

    }
}
