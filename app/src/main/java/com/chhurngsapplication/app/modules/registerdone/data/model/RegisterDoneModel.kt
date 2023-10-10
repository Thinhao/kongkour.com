package com.chhurngsapplication.app.modules.registerdone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterDoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl11)

)
