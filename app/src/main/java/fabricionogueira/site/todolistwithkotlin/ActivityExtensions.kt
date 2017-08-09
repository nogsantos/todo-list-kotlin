package fabricionogueira.site.todolistwithkotlin

import android.app.Activity
import android.widget.Toast

/**
 * Created by nogsantos on 8/9/17.
 */

fun Activity.showShortToast(text: String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}