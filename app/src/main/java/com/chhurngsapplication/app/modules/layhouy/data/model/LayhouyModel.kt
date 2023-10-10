package com.chhurngsapplication.app.modules.layhouy.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LayhouyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_winnie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_graphic_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_graphic_designe2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_80m_follower)

)
