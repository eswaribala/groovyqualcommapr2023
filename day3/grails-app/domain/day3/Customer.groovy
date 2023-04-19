package day3

class Customer {

    String firstName
    String lastName
    Long phone
    String email
    Gender gender
    Integer totalPoints
    static hasMany = [awards:Award,orders:OnlineOrder]
    static constraints = {
        firstName(size: 5..25,matches: "[a-zA-Z]{5,50}",nullable: false,blank: false)
        lastName(size: 3..25,matches: "[a-zA-Z]{5,50}",nullable: false,blank: false)
        gender(nullable: false,blank: false)
        phone(matches: "\\d{10}")
        email(nullable: false,email: true)
        totalPoints(max: 100)
    }
    static mapping = {
        tablePerHierarchy false
    }
}
