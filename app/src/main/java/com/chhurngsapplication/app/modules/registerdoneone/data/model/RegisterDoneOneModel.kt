package com.chhurngsapplication.app.modules.registerdoneone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterDoneOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYouraccountha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_ha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)

)
