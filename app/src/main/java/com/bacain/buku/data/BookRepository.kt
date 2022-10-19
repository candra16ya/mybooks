package com.bacain.buku.data

import com.bacain.buku.data.model.BookItems
import com.bacain.buku.data.network.BookItemsInfo

class BookRepository(){
    companion object{
        fun getAllBook(): List<BookItems>{
            val allBook = BookItemsInfo.bookList
            return allBook.reversed()
        }
        fun findBook(title: String): BookItems?{
            for (book in BookItemsInfo.bookList) {
                if (book.title == title) {
                    return book
                }
            }
            return null
        }
    }
}