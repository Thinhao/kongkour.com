package com.chhurngsapplication.app.modules.one.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListplaceholderFourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_design2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_graphic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContentCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_content)

)
