package fabricionogueira.site.todolistwithkotlin

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by nogsantos on 8/10/17.
 */
class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        realmInitConfig()
    }

    /**
     * Realm init configurations
     */
    fun realmInitConfig(){
        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
                .name("todo.realm")
                .schemaVersion(0) // Must be bumped when the schema changes
                .migration(Migration()) // Migration to run instead of throwing an exception
                .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}