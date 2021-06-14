package id.topan.submitionpemula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnBackAboutActivity: ImageView = findViewById(R.id.btn_back_about_activity)
        btnBackAboutActivity.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_back_about_activity -> {
                val moveIntent = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}