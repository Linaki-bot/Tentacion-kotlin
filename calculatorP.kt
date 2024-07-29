fun main() {
    // Display menu
    println("Simple Calculator")
    println("Select operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    // Read the user's choice
    print("Enter choice (1/2/3/4): ")
    val choice = readLine()?.toIntOrNull()

    // Check if the choice is valid
    if (choice !in 1..4) {
        println("Invalid choice")
        return
    }

    // Read numbers from the user
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    // Check if the numbers are valid
    if (num1 == null || num2 == null) {
        println("Invalid numbers")
        return
    }

    // Perform the calculation based on the user's choice
    val result = when (choice) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Division by zero is not allowed")
                return
            }
        }
        else -> {
            println("Unexpected error")
            return
        }
    }

    // Print the result
    println("The result is $result")
}
