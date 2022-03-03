import java.util.*
import java.util.Calendar.*
import java.util.Calendar.*
fun main( ) {
    fun dayOfWeek() {
        println(" today?")
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        println(when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            else -> "Time has stopped"
        }
        )
    }
    dayOfWeek( )
}