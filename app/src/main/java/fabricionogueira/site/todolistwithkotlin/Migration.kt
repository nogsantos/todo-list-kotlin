package fabricionogueira.site.todolistwithkotlin

import io.realm.DynamicRealm
import io.realm.RealmMigration

/**
 * Created by nogsantos on 8/10/17.
 */

class Migration: RealmMigration{

    override fun migrate(realm: DynamicRealm?, oldVersion: Long, newVersion: Long) {
        val schema = realm?.schema
    }
}