package com.chhurngsapplication.app.modules.profilegalleryeight.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileGalleryEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNathan: String? = MyApp.getInstance().resources.getString(R.string.lbl_nathan)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterprenure: String? = MyApp.getInstance().resources.getString(R.string.lbl_enterprenure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl10)

)
