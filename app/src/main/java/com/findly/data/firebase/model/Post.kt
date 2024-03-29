package com.findly.data.firebase.model

import java.io.Serializable

/**
 * Created by Wojdor on 21.04.2018.
 */
class Post : Serializable {
    var key: String = ""
    var imageUrl: String = ""
    var comments: Map<String, Comment> = emptyMap()
    var userName: String = ""
    var description: String = ""
}