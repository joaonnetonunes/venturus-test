package ventutus.com.test.model

import java.io.Serializable

class AdConfig : Serializable {
    var safeFlags: List<String>? = null
    var highRiskFlags: List<String>? = null
    var usafeFlags: List<String>? = null
    var wallUnsafeFlags: List<String>? = null
    var showsAds: Boolean? = null
}