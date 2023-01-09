package com.superplusgames.hosandroi.ottther.cllllaaas

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class GeoDev(
    @SerializedName("geoSasha")
    val geoSasha: String,
    @SerializedName("viewSasha")
    val viewSasha: String,
    @SerializedName("appsCheckerSasha")
    val appsCheckerSasha: String,
)