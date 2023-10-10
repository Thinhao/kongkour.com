package com.chhurngsapplication.app.modules.commentsoklayhouyone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentSokLayhouyOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSokLayhouy: String? = MyApp.getInstance().resources.getString(R.string.lbl_sok_layhouy2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_bra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_9_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_1k_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_davuth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_differentiation)

)
