package com.chhurngsapplication.app.modules.sixteen.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListplaceholderFive1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDESIGNOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_design3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroductionto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduction_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContentCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_26_content)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_22)

)
