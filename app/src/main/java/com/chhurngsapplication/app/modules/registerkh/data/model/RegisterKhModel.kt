package com.chhurngsapplication.app.modules.registerkh.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterKhModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogle: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangetoEN: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_to_en)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyFourValue: String? = null
)
