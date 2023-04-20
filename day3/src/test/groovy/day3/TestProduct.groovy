package day3

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertNotNull
import static org.junit.jupiter.api.Assertions.assertTrue
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
}
