package com.chhurngsapplication.app.modules.profilegalleryone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileGalleryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWinnie: String? = MyApp.getInstance().resources.getString(R.string.lbl_winnie2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_80m_follower2)
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
  var txtSeventyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl10)

)
