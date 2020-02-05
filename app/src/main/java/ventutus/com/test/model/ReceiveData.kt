package ventutus.com.test.model

import java.io.Serializable

class ReceiveData: Serializable{

    var data: List<Picture>? = null
    var success: Boolean? = null
    var status: Int? = null
}