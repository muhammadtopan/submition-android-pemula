package id.topan.submitionpemula

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class DetailAdapter: AppCompatActivity(), View.OnClickListener{

    private var list: ArrayList<FruitsData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detail)
    }

    override fun onClick(v: View?) {

    }


}