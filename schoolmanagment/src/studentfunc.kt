fun studentGet() {
    try {
        println("Enter ID:")
        val id = readln().toInt()
        println("Enter name:")
        val name = readln()
        println("Enter password (minimum 5 characters):")
        var password = readln()
        while (password.length < 5) {
            println("You must enter at least 5 characters.")
            password = readln()
        }
        println("Enter major:")
        val major = readln()
        val student = Students(id, name, password, major)
        StudentOperations.addStudent(student)
    } catch (e: NumberFormatException) {
        println("Please enter a valid number.")
    }
}
fun deleteStudent() {
    println("Enter the name of the student to delete:")
    val name = readln()
    val student = StudentOperations.getStudentByName(name)
    if (student != null) {
        StudentOperations.removeStudent(student)
        println("Student removed successfully")
    } else {
        println("Student not found")
    }
}