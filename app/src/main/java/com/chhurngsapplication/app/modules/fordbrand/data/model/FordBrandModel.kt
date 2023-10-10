package com.chhurngsapplication.app.modules.fordbrand.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FordBrandModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyOne: String? = MyApp.getInstance().resources.getString(R.string.msg15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFORD2021: String? = MyApp.getInstance().resources.getString(R.string.lbl_ford_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_the_ford_brand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
