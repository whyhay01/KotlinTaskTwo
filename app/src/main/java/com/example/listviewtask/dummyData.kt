package com.example.listviewtask

object dummyData {
    val models = listOf(dbModel(
        "Kotlin",
        R.drawable.kotlin,
        "The name comes from Kotlin Island, near St. Petersburg. Andrey Breslav mentioned " +
                "that the team decided to name it after an island, just like Java was named after the" +
                "Indonesian island of Java[18] (though the programming language Java was perhaps named after the coffee)" +
                "Kotlin is a cross-platform, statically typed, general-purpose programming language" +
                " with type inference. Kotlin is designed to inter-operate fully with Java, and the" +
                " JVM version of Kotlin's standard library depends on the Java Class Library, but" +
                " type inference allows its syntax to be more concise. Kotlin mainly targets the JVM," +
                " but also compiles to JavaScript (e.g., for frontend web applications using React)" +
                " or native code (via LLVM); e.g., for native iOS apps sharing business logic with " +
                "Android apps.Language development costs are borne by JetBrains, while the Kotlin Foundation " +
                "protects the Kotlin trademark"
    ),
    dbModel(
        "Java",
        R.drawable.java,
        "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project" +
                " in June 1991.[22] Java was originally designed for interactive television, but it was too" +
                " advanced for the digital cable television industry at the time.[23] The language was initially" +
                " called Oak after an oak tree that stood outside Gosling's office. Later the project went by the" +
                " name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia." +
                "Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar."),
    dbModel(
        "Python",
        R.drawable.python,
        "Python was conceived in the late 1980s by Guido van Rossum at Centrum Wiskunde & Informatica" +
                "(CWI) in the Netherlands as a successor to ABC programming language, which was inspired by SETL," +
                " capable of exception handling and interfacing with the Amoeba operating system.Its implementation" +
                " began in December 1989. Van Rossum shouldered sole responsibility for the project, as the lead" +
                " developer, until 12 July 2018, when he announced his permanent vacation from his responsibilities " +
                "as Python's Benevolent Dictator For Life, a title the Python community bestowed upon him to" +
                " reflect his long-term commitment as the project's chief decision-maker"
    ),
    dbModel(
        "JavaScript",
        R.drawable.javascript,
        "The Mosaic web browser was released in 1993. As the first browser with a graphical" +
                " user interface accessible to non-technical people, it played a prominent role in the " +
                "rapid growth of the nascent World Wide Web.[13] The lead developers of Mosaic then founded " +
                "the Netscape corporation, which released a more polished browser, Netscape Navigator, in 1994." +
                " Navigator quickly became the most used browser."
    ),
    dbModel(
        "Php",
        R.drawable.php,
        "PHP development began in 1994 when Rasmus Lerdorf wrote several Common Gateway Interface " +
                "(CGI) programs in C,[14][15][16] which he used to maintain his personal homepage. " +
                "He extended them to work with web forms and to communicate with databases, and called this" +
                " implementation Personal Home Page/Forms Interpreter or PHP/F"
    ),
    dbModel(
        "C++",
        R.drawable.c,
        "In 1979, Bjarne Stroustrup, a Danish computer scientist, began work on \"C with Classes\"," +
                " the predecessor to C++. The motivation for creating a new language originated from Stroustrup's" +
                " experience in programming for his PhD thesis. Stroustrup found that Simula had features that" +
                " were very helpful for large software development, but the language was too slow for practical use," +
                " while BCPL was fast but too low-level to be suitable for large software development. When Stroustrup " +
                "started working in AT&T Bell Labs, he had the problem of analyzing the UNIX kernel with respect to " +
                "distributed computing."
    ),
    dbModel(
        "Dart",
        R.drawable.dart,
        "Dart initially had a mixed reception and the Dart initiative has been criticized by some " +
                "for fragmenting the web, due to the original plans to include a Dart VM in Chrome. " +
                "Those plans were dropped in 2015 with the 1.9 release of Dart to focus instead on " +
                "compiling Dart to JavaScript."
    ))
}