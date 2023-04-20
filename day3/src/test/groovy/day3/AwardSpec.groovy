package day3

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AwardSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "#award point test"() {
        expect:
        award.getPoints() == points

        where:
        award                   || points
        new Award(type: "Excellent")  || "5"
        new Award(type: "VeryGood") || "4"
    }

    static class Award {
        Integer points
        String type
        String getPoints() {
            type == "Excellent" ? 5 : 3
        }
    }
    void "test something"() {
        expect:"fix me"
            true == false
    }
}
