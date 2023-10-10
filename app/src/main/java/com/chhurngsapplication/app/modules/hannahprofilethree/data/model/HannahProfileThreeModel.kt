package com.chhurngsapplication.app.modules.hannahprofilethree.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HannahProfileThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKhalAuthor: String? = MyApp.getInstance().resources.getString(R.string.lbl_khal_author)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGraphicDesinge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_graphic_desinge)
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
