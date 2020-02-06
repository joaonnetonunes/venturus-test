package ventutus.com.test.repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ventutus.com.test.controller.retrofit.RetrofitInitializer
import ventutus.com.test.model.Picture
import ventutus.com.test.model.ReceiveData

class MainRepository {

    fun getPictures() : LiveData<List<Picture>> {

        val images = MutableLiveData<List<Picture>>()

        RetrofitInitializer().picturesService()
            .get("Client-ID 3b883f41ad86df1", "Venturus-Test", "cats")
            .enqueue(object : Callback<ReceiveData>{

                override fun onFailure(call: Call<ReceiveData>, t: Throwable) {

                   Log.i("--->", t.message.toString())
                }

                override fun onResponse(call: Call<ReceiveData>, response: Response<ReceiveData>) {
                    response.body()?.data?.also { pictures ->
                        images.setValue(pictures)
                    }
                }
            })

        return images
    }
}