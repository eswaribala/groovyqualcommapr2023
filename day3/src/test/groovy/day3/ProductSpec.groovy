package day3

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

import java.time.LocalDate

class ProductSpec extends Specification implements DomainUnitTest<Product> {

    def setup() {
    }

    def cleanup() {
    }

    def "Product List Grows when New Product Added"(){
        given:
        def list = TestProduct.getProductList()
        when:
        list.add(new Product(5L,"Watch",5000))

        then:

        list.size() >3
    }


    void "test something"() {
        expect:"fix me"
            true == false
    }
}
