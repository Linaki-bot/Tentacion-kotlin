//Determining whether a letter is a vowel or a consonant

fun main() {
    // Prompt the user to enter a single letter
    print("Enter a letter: ")
    val input = readLine()

    // Check if the input is a single letter
    if (input != null && input.length == 1 && input[0].isLetter()) {
        // Convert the input to lowercase for easier comparison
        val letter = input[0].lowercaseChar()

        // Check if the letter is a vowel
        if (letter in "aeiou") {
            println("$letter is a vowel.")
        } else {
            println("$letter is a consonant.")
        }
    } else {
        println("Invalid input. Please enter a single letter.")
    }
}


