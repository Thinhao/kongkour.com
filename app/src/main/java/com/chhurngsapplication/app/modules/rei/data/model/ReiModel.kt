package com.chhurngsapplication.app.modules.rei.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReiModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_80m)

)
