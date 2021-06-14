package id.topan.submitionpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvFruit: RecyclerView
    private var list: ArrayList<Fruit> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout: ImageView = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener(this)
        rvFruit = findViewById(R.id.rv_fruits)
        rvFruit.setHasFixedSize(true)

        list.addAll(FruitsData.listData)
        showRecyclerList()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showRecyclerList() {
        rvFruit.layoutManager = LinearLayoutManager(this)
        val listFruitAdapter = ListFruitAdapter(list)
        rvFruit.adapter = listFruitAdapter
    }
}










