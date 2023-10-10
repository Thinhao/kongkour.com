package com.chhurngsapplication.app.modules.nathan.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NathanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNathan: String? = MyApp.getInstance().resources.getString(R.string.lbl_nathan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_photographer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_passionate_grap2)
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
