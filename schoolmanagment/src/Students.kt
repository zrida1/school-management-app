class Students(
    override var id: Int,
    name: String,
    private var password: String,
    private var major: String
) : UserData {
    override var name: String = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }


    override fun displayUserData() {
        super.displayUserData()
        println("I am a $major student.\n")
    }
}
object StudentOperations {
    private val students = mutableListOf<Students>()

    fun addStudent(student: Students) {
        students.add(student)
    }

    fun removeStudent(student: Students) {
        students.remove(student)
    }

    fun displayStudents() {
        if (students.isEmpty()) {
            println("No students to display.")
        } else {
            println("Students:")
            students.forEachIndexed { index, student ->
                print("${index + 1}. ")
                student.displayUserData()
            }
        }
    }

    fun getStudentByName(name: String): Students? {
        return students.find { it.name == name.uppercase() }
    }
}