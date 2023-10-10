package com.chhurngsapplication.app.modules.theaone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TheaOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSothea: String? = MyApp.getInstance().resources.getString(R.string.lbl_sothea)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_graphic_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloeveryone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_everyone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_80m_follower)

)
