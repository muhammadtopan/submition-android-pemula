package id.topan.submitionpemula

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFruitAdapter(val listFruit: ArrayList<Fruit>) : RecyclerView.Adapter<ListFruitAdapter.ListViewHolder>(), View.OnClickListener {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_fruit, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fruit = listFruit[position]
        Glide.with(holder.itemView.context)
            .load(fruit.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = fruit.name
        holder.tvDetail.text = fruit.detail

        holder.itemrow.setOnClickListener {
            val contex:Context = it!!.context
            val intent = Intent(contex, FruitDetailActivity::class.java)
            intent.putExtra("NAMA", fruit.name)
            intent.putExtra("DETAIL", fruit.detail)
            intent.putExtra("FOTO", fruit.photo)
            contex.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_fruit_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var itemrow : LinearLayout = itemView.findViewById(R.id.item_row_fruit)

    }

    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.item_row_fruit -> {
//                val moveIntent = Intent(this, FruitDetailActivity::class.java)
//                startActivity(moveIntent)
//            }
//        }
    }
}