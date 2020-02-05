package ventutus.com.test.controller.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ventutus.com.test.R
import ventutus.com.test.model.Picture

class PictureAdapter(private val pictureList: List<Picture>) :
    RecyclerView.Adapter<PictureAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.picture_adapter,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val picture = pictureList[position]
        holder.bindView(picture)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(picture: Picture) {

            val image = itemView.findViewById<ImageView>(R.id.PictureImageView)
            val pictureImage = picture.images?.get(0)

            if (pictureImage != null) {
                Glide.with(itemView.context).load(pictureImage.link).into(image)
            }

        }

    }
}