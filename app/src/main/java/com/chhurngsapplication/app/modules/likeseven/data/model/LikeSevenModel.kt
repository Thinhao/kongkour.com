package com.chhurngsapplication.app.modules.likeseven.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_the_most_poster)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
