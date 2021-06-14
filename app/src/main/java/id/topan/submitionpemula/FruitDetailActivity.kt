package id.topan.submitionpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.get

class FruitDetailActivity : AppCompatActivity(), View.OnClickListener{

    companion object{
        val EXTRA_NAMA = "NAMA"
        val EXTRA_DETAIL = "DETAIL"
        val EXTRA_PHOTO = "FOTO"
    }
//    private lateinit var cvDetail : CardView
//    private var list: ArrayList<FruitsData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detail)


        val nama = intent.getStringExtra(EXTRA_NAMA)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getStringExtra(EXTRA_PHOTO)

        val btnBackToActivity: ImageView = findViewById(R.id.btn_back_to_activity)
        btnBackToActivity.setOnClickListener(this)

        val fruitName: TextView = findViewById(R.id.tv_item_fruit_name)
        val fruitDetail: TextView = findViewById(R.id.tv_item_detail)
        val fruitPhoto: ImageView = findViewById(R.id.iv_item_photo)

        fruitName.setText(nama)
        fruitDetail.setText(detail)
        fruitPhoto.setImageResource(intent.getIntExtra("FOTO", 0))

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_back_to_activity -> {
                val moveIntent = Intent(this, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }


}


















