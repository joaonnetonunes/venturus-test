package ventutus.com.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ventutus.com.test.controller.adapter.PictureAdapter
import ventutus.com.test.controller.retrofit.RetrofitInitializer
import ventutus.com.test.model.Picture
import ventutus.com.test.model.ReceiveData

class MainActivity : AppCompatActivity() {

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getPictures()
    }

    private fun setUpRecyclerView(picturesList: List<Picture>){
        val recyclerView = findViewById<RecyclerView>(R.id.PicturesRecyclerView)
        recyclerView.adapter = PictureAdapter(picturesList)
        recyclerView.layoutManager = GridLayoutManager(this, 4)

    }

    @ExperimentalStdlibApi
    private fun getPictures(){

        val clientId = "3b883f41ad86df1"


        RetrofitInitializer()
            .getPicturesService()
            .getImages(
                "Client-ID $clientId",
                "Venturus-Test",
                "cats"
            )
            .enqueue(object : Callback<ReceiveData>{
                override fun onFailure(call: Call<ReceiveData>, t: Throwable) {
                   Log.e("--->", t.message!!)
                    Log.e("--->", t.cause.toString())
                }

                override fun onResponse(
                    call: Call<ReceiveData>,
                    response: Response<ReceiveData>
                ) {
                    Log.i("--->", response.code().toString())
                    Log.i("--->", response.body().toString())

                   setUpRecyclerView(response.body()!!.data!!)
                }

            })


    }
}
