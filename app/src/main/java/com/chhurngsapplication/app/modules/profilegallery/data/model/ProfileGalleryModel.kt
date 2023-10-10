package com.chhurngsapplication.app.modules.profilegallery.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileGalleryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSothea: String? = MyApp.getInstance().resources.getString(R.string.lbl_sothea)
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
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl10)

)
