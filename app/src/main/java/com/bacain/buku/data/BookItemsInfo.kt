package com.bacain.buku.data

class BookItemsInfo {
    fun bookInfo(): List<BookItems>{
        val list = mutableListOf<BookItems>()

        list.add(BookItems(
            "Mark Manson",
            "The Subtle Art of Not Giving a Fuck",
            "https://covers.openlibrary.org/b/id/12833521-M.jpg"
        ))
        list.add(BookItems(
            "Colleen Hoover",
            "It Starts with Us",
            "https://covers.openlibrary.org/b/id/12941439-L.jpg"
        ))
        list.add(BookItems(
            "James Clear",
            "Atomic Habits",
            "https://covers.openlibrary.org/b/id/12886417-L.jpg"
        ))
        list.add(BookItems(
            "Robert T. Kiyosaki, Sharon L. Lechter, and Tim Wheeler",
            "RICH DAD, POOR DAD",
            "https://covers.openlibrary.org/b/id/12483178-L.jpg"
        ))
        list.add(BookItems(
            "Napoleon Hill",
            "The power of Positive thinking",
            "https://covers.openlibrary.org/b/id/11348446-L.jpg"
        ))
        list.add(BookItems(
            "Rick Riordan",
            "The lightning thief",
            "https://covers.openlibrary.org/b/id/7989100-L.jpg"
        ))
        list.add(BookItems(
            "Stephen Kingn",
            "It",
            "https://covers.openlibrary.org/b/id/12670684-L.jpg"
        ))
        list.add(BookItems(
            "Jennette McCurdy",
            "I'm Glad My Mom Died",
            "https://covers.openlibrary.org/b/id/12900508-L.jpg"
        ))
        return list
    }
}