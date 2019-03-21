package ch.itds.demo.mto

class Author {

    String name

    static hasMany = [books: Book]

    static constraints = {
    }
}
