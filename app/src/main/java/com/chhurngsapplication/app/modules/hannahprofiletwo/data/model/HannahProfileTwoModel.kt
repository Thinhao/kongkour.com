package com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HannahProfileTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHannah: String? = MyApp.getInstance().resources.getString(R.string.lbl_hannah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtist: String? = MyApp.getInstance().resources.getString(R.string.lbl_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_graphic_designe)
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
