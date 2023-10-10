package com.chhurngsapplication.app.modules.sophea.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SopheaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNathan: String? = MyApp.getInstance().resources.getString(R.string.lbl_nathan)
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
      MyApp.getInstance().resources.getString(R.string.msg_innovative_grap2)
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
