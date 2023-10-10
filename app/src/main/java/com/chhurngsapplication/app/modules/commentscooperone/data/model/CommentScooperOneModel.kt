package com.chhurngsapplication.app.modules.commentscooperone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentScooperOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVinnarakKavey: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vinnarak_kavey)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyThree: String? = MyApp.getInstance().resources.getString(R.string.msg8)
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
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
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
