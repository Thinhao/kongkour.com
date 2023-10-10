package com.chhurngsapplication.app.modules.commenthannah.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentHannahModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHannah: String? = MyApp.getInstance().resources.getString(R.string.lbl_hannah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtySeven: String? = MyApp.getInstance().resources.getString(R.string.msg8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt79kLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_9k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100comments: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyEight: String? = MyApp.getInstance().resources.getString(R.string.msg7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_ananda_via)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? = MyApp.getInstance().resources.getString(R.string.msg12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusansanae: String? = MyApp.getInstance().resources.getString(R.string.lbl_susan_sanae)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg13)

)
