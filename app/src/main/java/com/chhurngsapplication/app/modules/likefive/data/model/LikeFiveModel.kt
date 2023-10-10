package com.chhurngsapplication.app.modules.likefive.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_today_at_9_00_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_9k_like2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_comment2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_most_poster)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
