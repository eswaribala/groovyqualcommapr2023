package day3

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

   /* @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate()
    }*/

}