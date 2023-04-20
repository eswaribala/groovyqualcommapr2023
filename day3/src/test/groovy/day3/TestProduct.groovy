package day3

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource

import java.time.LocalDate
import java.util.stream.Stream

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertNotNull
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.params.provider.Arguments.arguments
import static org.junit.jupiter.params.provider.Arguments.arguments
import static org.junit.jupiter.params.provider.Arguments.arguments
import static org.junit.jupiter.params.provider.Arguments.arguments

//import static org.junit.jupiter.params.provider.Arguments.arguments

class TestProduct {

    static Product product
    @BeforeAll
    static void intialize(){
         product=new Product()
    }
    @Test
    void productNotNullTest(){

        assertNotNull(product)

    }

    @ParameterizedTest
    @ValueSource(ints = [8434659, 42858, 244,0,23576])
    void productCostAboveZeroTest(int cost) {

        product.setCost(cost)
        assertTrue(product.getCost()>0)
    }


    @ParameterizedTest
    @MethodSource("generateProductData")
    void productNameLengthTest(int productId,String productName, int cost) {
        product.setProductId(productId)
        product.setProductName(productName)
        product.setCost(cost)
        assertTrue(product.getProductName().length()>5)

    }

    static Stream<Arguments> generateProductData() {

        return Stream.of(
                arguments(1,"Mouse",400),
                arguments(2,"KeyBoard",660),
                arguments(3,"Pouch",567)


        );
    }

   static def getProductList(){
        def products=new ArrayList<Product>()
        products.add(new Product(1L,"Mouse",400))
        products.add(new Product(2L,"KeyBoard",660))
        products.add(new Product(3L,"Pouch",567))
       return products
    }
}
