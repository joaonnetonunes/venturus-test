package ventutus.com.test.model

import java.io.Serializable

class Picture: Serializable{

    var id: String? = null
    var title: String? = null
    var description: String? = null
    var datetime: Int? = null
    var cover: String? = null
    var cover_width: Int? = null
    var cover_height: Int? = null
    var account_url: String? = null
    var account_id: Int? = null
    var privacy: String? = null
    var layout: String? = null
    var views: Int? = null
    var link: String? = null
    var ups: Int? = null
    var downs: Int? = null
    var points: Int? = null
    var score: Int? = null
    var is_album: Boolean? = null
    var vote: Int? = null
    var favorite: Boolean? = null
    var nsfw: Boolean? = null
    var section: String? = null
    var comment_count: Int? = null
    var favorite_count: Int? = null
    var topic: String? = null
    var topic_id: Int? = null
    var images_count: Int? = null
    var in_gallery: Boolean? = null
    var is_ad: Boolean? = null
    var tags: List<Tags>? = null
    var ad_type: Int? = null
    var ad_url: String? = null
    var in_most_viral: Boolean? = null
    var include_album_ads: Boolean? = null
    var images: List<Images>? = null
    var ad_config: AdConfig? = null

}