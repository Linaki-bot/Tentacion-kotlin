 // A= L * W

 fun main() {
     // Prompt the user to enter the width of the rectangle
     print("Enter the width of the rectangle: ")
     val width = readLine()?.toDoubleOrNull()

     // Prompt the user to enter the height of the rectangle
     print("Enter the height of the rectangle: ")
     val height = readLine()?.toDoubleOrNull()

     // Check if the input values are valid
     if (width != null && height != null) {
         // Calculate the area of the rectangle
         val area = width * height
         // Display the result
         println("The area of the rectangle is: $area")
     } else {
         println("Invalid input. Please enter numeric values for width and height.")
     }
 }
