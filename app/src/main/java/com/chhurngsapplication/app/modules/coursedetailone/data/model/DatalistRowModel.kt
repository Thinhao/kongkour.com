package com.chhurngsapplication.app.modules.coursedetailone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DatalistRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIntrotoGraphi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_intro_to_graphi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_24min)

)
