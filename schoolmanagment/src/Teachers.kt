class Teachers(
    override var id: Int,
    name: String,
    private var password: String,
    private var subject: String
) : UserData {
    override var name: String = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    override fun displayUserData() {
        super.displayUserData()
        println("I am a $subject teacher.\n")
    }
}
object TeacherOperations {
    private val teachers = mutableListOf<Teachers>()

    fun addTeacher(teacher: Teachers) {
        teachers.add(teacher)
    }

    fun removeTeacher(teacher: Teachers) {
        teachers.remove(teacher)
    }

    fun displayTeachers() {
        if (teachers.isEmpty()) {
            println("No teachers to display.")
        } else {
            println("Teachers:")
            teachers.forEachIndexed { index, teacher ->
                print("${index + 1}. ")
                teacher.displayUserData()
            }
        }
    }

    fun getTeacherByName(name: String): Teachers? {
        return teachers.find { it.name == name.uppercase() }
    }
}
