package ventutus.com.test.controller.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInitializer {

    private var retrofit: Retrofit

    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .retryOnConnectionFailure(false)
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl("https://api.imgur.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    fun getPicturesService(): GetPicturesService {
        return retrofit.create(GetPicturesService::class.java)
    }
}