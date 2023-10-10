package com.chhurngsapplication.app.modules.reione.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReiOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRei: String? = MyApp.getInstance().resources.getString(R.string.lbl_rei)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGraphicDesign: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_graphic_design2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_design_is_my_la)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_80m_follower)

)
