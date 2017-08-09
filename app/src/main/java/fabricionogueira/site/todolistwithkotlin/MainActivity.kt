package fabricionogueira.site.todolistwithkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val todos : MutableList<Todo> by lazy { mutableListOf<Todo>() }
    private var adapter : ArrayAdapter<Todo>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabAdd.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivityForResult(intent, REQUEST_INSERT)
        }

        listTodos.setOnItemClickListener { _, _, position, _ ->
            showShortToast(this.todos[position].description)
        }

        adapter = ArrayAdapter<Todo>(this, android.R.layout.simple_list_item_1, this.todos)
        listTodos.adapter = adapter!!
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_INSERT && resultCode == Activity.RESULT_OK){
            Log.d("FNS", "request")
            val todo = data?.getSerializableExtra(DetailActivity.EXTRA_TODO) as? Todo
            if(todo != null){
                Log.d("FNS", "not null")
                this.todos.add(todo)
                adapter?.notifyDataSetChanged()
            }
        }
    }

    companion object {
        val REQUEST_INSERT = 0
    }
}
