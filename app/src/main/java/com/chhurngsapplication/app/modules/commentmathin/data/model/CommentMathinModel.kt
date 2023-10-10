package com.chhurngsapplication.app.modules.commentmathin.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentMathinModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_poster_design_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
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
