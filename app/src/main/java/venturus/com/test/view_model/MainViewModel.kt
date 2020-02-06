package ventutus.com.test.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ventutus.com.test.model.Picture
import ventutus.com.test.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()
    val images: LiveData<List<Picture>> = repository.getPictures()
}