package com.chhurngsapplication.app.modules.liketwo.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyOne: String? = MyApp.getInstance().resources.getString(R.string.msg8)
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
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_courses_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
