package com.chhurngsapplication.app.modules.coursedetailtwo.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CoursedetailTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredFiftySix: String? = MyApp.getInstance().resources.getString(R.string.msg_456)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.msg_234)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixty: String? = MyApp.getInstance().resources.getString(R.string.msg20)

)
