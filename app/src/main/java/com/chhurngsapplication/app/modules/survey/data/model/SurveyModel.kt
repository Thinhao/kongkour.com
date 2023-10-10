package com.chhurngsapplication.app.modules.survey.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SurveyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventeen: String? = MyApp.getInstance().resources.getString(R.string.msg3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNineteen: String? = MyApp.getInstance().resources.getString(R.string.lbl13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.msg4)

)
