fun teacherGet() {
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
        println("Enter subject:")
        val subject = readln()
        val teacher = Teachers(id, name, password, subject)
        TeacherOperations.addTeacher(teacher)
    } catch (e: NumberFormatException) {
        println("Please enter a valid number.")
    }
}

fun deleteTeacher() {
    println("Enter the name of the teacher to delete:")
    val name = readln()
    val teacher = TeacherOperations.getTeacherByName(name)
    if (teacher != null) {
        TeacherOperations.removeTeacher(teacher)
        println("Teacher removed successfully")
    } else {
        println("Teacher not found")
    }
}