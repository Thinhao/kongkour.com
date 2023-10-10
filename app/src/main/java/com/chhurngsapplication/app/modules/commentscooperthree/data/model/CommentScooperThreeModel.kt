package com.chhurngsapplication.app.modules.commentscooperthree.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentScooperThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScooper: String? = MyApp.getInstance().resources.getString(R.string.lbl_scooper2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_9_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_1k_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_99_comments)
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
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_ananda_via)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_the_poster_des)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusansanae: String? = MyApp.getInstance().resources.getString(R.string.lbl_susan_sanae)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_poster_des2)

)
