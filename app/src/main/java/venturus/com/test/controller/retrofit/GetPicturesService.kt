package ventutus.com.test.controller.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import ventutus.com.test.model.ReceiveData

interface GetPicturesService {

    @GET("/3/gallery/search")
    fun getImages(
        @Header("Authorization") ClientID: String,
        @Header("User-Agent") app: String,
        @Query("q") Query: String
    ): Call<ReceiveData>
}