package ch.itds.demo.mto

class Book {

    String name

    static hasOne = [author: Author]

    static constraints = {
        author(nullable: true)
    }
}
