package manytooneexample

import ch.itds.demo.mto.Author
import ch.itds.demo.mto.Book

class BootStrap {

    def init = { servletContext ->

        Author.findOrSaveWhere(name: 'Author 0')
        Author.findOrSaveWhere(name: 'Author 1')
        Author.findOrSaveWhere(name: 'Author 2')
        Book.findOrSaveWhere(name: 'Book 1')
        Book.findOrSaveWhere(name: 'Book 2')
        Book.findOrSaveWhere(name: 'Book 3')
        Book.findOrSaveWhere(name: 'Book 4')

    }
    def destroy = {
    }
}
