package fabricionogueira.site.todolistwithkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btnSave.setOnClickListener {
            val description = edtDescription.text.toString()
            Log.d("FNS", description)
            val todo = Todo(description, false)

            val intent = Intent()
            intent.putExtra(EXTRA_TODO, todo)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    companion object {
        val EXTRA_TODO = "todo"
    }
}
