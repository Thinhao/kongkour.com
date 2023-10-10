package com.chhurngsapplication.app.modules.coursedetailthree.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Datalist5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroductionto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduction_to3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_24min)

)
