package ventutus.com.test.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*
import ventutus.com.test.R
import ventutus.com.test.controller.adapter.PictureAdapter
import ventutus.com.test.model.Picture
import ventutus.com.test.view_model.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    private val pictures = ArrayList<Picture>()
    private val adapter = PictureAdapter(pictures)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        initialize()
    }

    private fun initialize() {
        this.setUpAppBar()
        this.setUpRecyclerView()
        this.getPictures()
    }

    private fun setUpAppBar() {
        setSupportActionBar(toolbar)
        appbarTitle.text = "Imagens"
    }

    private fun setUpRecyclerView() {
        swipe_pictures.isEnabled = false
        recycler_view_pictures.adapter = adapter
        recycler_view_pictures.layoutManager = GridLayoutManager(this, 4)
    }

    private fun getPictures() {

        swipe_pictures.isRefreshing = true

        viewModel.images.observe(this, Observer<List<Picture>> { newPictures ->
            pictures.addAll(newPictures)
            adapter.notifyDataSetChanged()
            swipe_pictures.isRefreshing = false
        })
    }
}
