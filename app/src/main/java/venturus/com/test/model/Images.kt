package ventutus.com.test.model

import java.io.Serializable

class Images: Serializable {
    var id: String? = null
    var title: String? = null
    var datetime: Int? = null
    var type: String? = null
    var animated: Boolean? = null
    var width: Int? = null
    var height: Int? = null
    var size: Int? = null
    var views: Int? = null
    var bandwidth: Double? = null
    var vote: Int? = null
    var favorite: Boolean? = null
    var nsfw: Int? = null
    var section: Int? = null
    var account_url: String? = null
    var accountId: String? = null
    var is_ad: Boolean? = null
    var in_most_viral: Boolean? = null
    var has_sound: Boolean? = null
    var tags: List<Tags>? = null
    var ad_type: Int? = null
    var ad_url: String? = null
    var edited: String? = null
    var in_gallery: Boolean? = null
    var link: String? = null
    var comment_count: Int? = null
    var favorite_count: Int? = null
    var ups: Int? = null
    var downs: Int? = null
    var points: Int? = null
    var score: Int? = null
}