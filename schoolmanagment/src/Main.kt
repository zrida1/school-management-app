fun main() {
    while (true) {
        println("School Management App:")
        println("1. Register")
        println("2. Show")
        println("3. Delete")
        println("4. Exit")
        println("Please enter your choice:")
        try {
            when (readln().toInt()) {
                1 -> first()
                2 -> second()
                3 -> third()
                4 -> break
                else -> println("Invalid operation\n")
            }
        } catch (e: NumberFormatException) {
            println("Please enter a valid number.")
        }
    }
}
fun first() {
    println("You are: \n1. Student \n2. Teacher")
    try {
        val choice = readln().toInt()
        when (choice) {
            UserRole.STUDENT.value -> studentGet()
            UserRole.TEACHER.value -> teacherGet()
            else -> println("Invalid operation\n")
        }
    } catch (e: NumberFormatException) {
        println("Please enter a valid number.")
    }
}
fun second() {
    println("You are: \n1. Student \n2. Teacher")
    try {
        val choice = readln().toInt()
        when (choice) {
            UserRole.STUDENT.value -> StudentOperations.displayStudents()
            UserRole.TEACHER.value -> TeacherOperations.displayTeachers()
            else -> println("Invalid operation")
        }
    } catch (e: NumberFormatException) {
        println("Please enter a valid number.")
    }
}
fun third() {
    println("You are: \n1. Student \n2. Teacher")
    try {
        val choice = readln().toInt()
        when (choice) {
            UserRole.STUDENT.value -> deleteStudent()
            UserRole.TEACHER.value -> deleteTeacher()
            else -> println("Invalid operation")
        }
    } catch (e: NumberFormatException) {
        println("Please enter a valid number.")
    }
}

