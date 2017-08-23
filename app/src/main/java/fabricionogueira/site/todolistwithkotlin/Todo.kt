package fabricionogueira.site.todolistwithkotlin

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

/**
 * Created by nogsantos on 8/9/17.
 */

open class Todo : RealmObject(), Serializable {
    @PrimaryKey var description: String? = null
    var completed: Boolean? = false

//    override fun toString(): String {
//        return "$description - $completed"
//    }
}