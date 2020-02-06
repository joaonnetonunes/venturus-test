package ventutus.com.test.controller.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.picture_adapter.view.*
import ventutus.com.test.R
import ventutus.com.test.model.Picture

class PictureAdapter(private val pictures: List<Picture>) :
    RecyclerView.Adapter<PictureAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.picture_adapter,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = pictures.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bindView(pictures[position])

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(picture: Picture) {
            picture.images?.get(0)?.also { image ->
                Glide.with(itemView.context).load(image.link).into(itemView.image_view_picture)
            }
        }
    }
}