package fabricionogueira.site.todolistwithkotlin

import io.realm.Realm
import io.realm.RealmResults

/**
 * Created by nogsantos on 8/10/17.
 */

class TodoDao {

    fun cadastrar(todo: Todo) {
        val realm = Realm.getDefaultInstance()
        realm.use { realm ->
            realm.beginTransaction()
            realm.copyToRealmOrUpdate(todo)
            realm.commitTransaction()
        }
    }

    /**
     * RealmResults<Todo>
     */
    fun listar(): RealmResults<Todo>? {
        val realm = Realm.getDefaultInstance()
        realm.use { realm ->
            return realm.where(Todo::class.java).findAll()
        }
    }
}