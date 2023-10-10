package com.chhurngsapplication.app.modules.likefour.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyFour: String? = MyApp.getInstance().resources.getString(R.string.msg8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_9k_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyBestArtworkOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_best_artwork)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
