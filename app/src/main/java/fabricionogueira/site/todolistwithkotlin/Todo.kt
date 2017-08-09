package fabricionogueira.site.todolistwithkotlin

import java.io.Serializable

/**
 * Created by nogsantos on 8/9/17.
 */

data class Todo(var description: String, var completed: Boolean): Serializable{
    override fun toString(): String {
        return "$description - $completed"
    }
}