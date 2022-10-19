package com.bacain.buku.data

class BookItemsInfo {
    companion object{

        var bookList = BookInfo()

        private fun BookInfo(): MutableList<BookItems>{

            val list = mutableListOf<BookItems>()
            list.add(BookItems(
                "Mark Manson",
                "The Subtle Art of Not Giving a Fuck",
                "https://covers.openlibrary.org/b/id/12833521-M.jpg",
                "The Subtle Art of Not Giving a Fuck argues that individuals " +
                        "should seek to find meaning through what they find to be important" +
                        " and only engage in values that they can control. Values " +
                        "(such as popularity) that are not under a person's control, " +
                        "are, according to the book, 'bad values'."
            ))
            list.add(BookItems(
                "Colleen Hoover",
                "It Starts with Us",
                "https://covers.openlibrary.org/b/id/12941439-L.jpg",
                "The book follows the story of a girl named Lily who " +
                        "has just graduated from college and is ready to start " +
                        "a new chapter in her life. Soon after, she meets a boy, " +
                        "Ryle, and instantly falls for him. However, things get " +
                        "complicated when the first boy she fell for, Atlas, shows up."
            ))
            list.add(BookItems(
                "James Clear",
                "Atomic Habits",
                "https://covers.openlibrary.org/b/id/12886417-L.jpg",
                "Learn about the easy and proven way to build good " +
                        "habits and break the bad ones. What’s a habit? If " +
                        "someone were to ask you about your daily habits, you " +
                        "might need some time to think about them. That’s because " +
                        "a habit, by definition, is an act that you perform automatically " +
                        "by instinct. Like when you walk into a dark room, you instinctively " +
                        "turn on a light switch, right? Habits are actions you don’t even have to " +
                        "think about, which is why you might not realize how a small daily action can " +
                        "have a powerful effect on your life. If you’re saving a dollar " +
                        "a day or smoking a cigarette a day, these actions may not seem like " +
                        "much now, but twenty years from now, those habits can either make you rich or, " +
                        "unfortunately, kill you. That’s why it’s important to understand how habits " +
                        "are formed, so you can learn how to kick the bad habits, implement the healthy " +
                        "ones, and take back control of your life."
            ))
            list.add(BookItems(
                "Robert T. Kiyosaki, Sharon L. Lechter, and Tim Wheeler",
                "RICH DAD, POOR DAD",
                "https://covers.openlibrary.org/b/id/12483178-L.jpg",
                "Rich Dad Poor Dad tells the story of a boy with two " +
                        "fathers, one rich, one poor, to help you develop the " +
                        "mindset and financial knowledge you need to build a life " +
                        "of wealth and freedom."
            ))
            list.add(BookItems(
                "Napoleon Hill",
                "The power of Positive thinking",
                "https://covers.openlibrary.org/b/id/11348446-L.jpg",
                "he Power Of Positive Thinking will show you that the " +
                        "roots of success lie in the mind and teach you how to " +
                        "believe in yourself, break the habit of worrying, and take " +
                        "control of your life by taking control of your thoughts and " +
                        "changing your attitude."
            ))
            list.add(BookItems(
                "Rick Riordan",
                "The lightning thief",
                "https://covers.openlibrary.org/b/id/7989100-L.jpg",
                "The Lightning Thief is a light-hearted fantasy about" +
                        " a modern 12-year-old boy who learns that his true father " +
                        "is Poseidon, the Greek god of the sea. Percy sets out to become" +
                        " a hero by undertaking a quest across the United States to find " +
                        "the entrance to the Underworld and stop a war between the gods."
            ))
            list.add(BookItems(
                "Stephen Kingn",
                "It",
                "https://covers.openlibrary.org/b/id/12670684-L.jpg",
                "The story follows the experiences of seven children " +
                        "as they are terrorized by an evil entity that exploits " +
                        "the fears of its victims to disguise itself while hunting " +
                        "its prey. \"It\" primarily appears in the form of Pennywise " +
                        "the Dancing Clown to attract its preferred prey of young children."
            ))
            list.add(BookItems(
                "Jennette McCurdy",
                "I'm Glad My Mom Died",
                "https://covers.openlibrary.org/b/id/12900508-L.jpg",
                "A heartbreaking and hilarious memoir by iCarly and " +
                        "Sam & Cat star Jennette McCurdy about her struggles " +
                        "as a former child actor—including eating disorders, " +
                        "addiction, and a complicated relationship with her overbearing " +
                        "mother—and how she retook control of her life."
            ))
            return list
        }
    }
}