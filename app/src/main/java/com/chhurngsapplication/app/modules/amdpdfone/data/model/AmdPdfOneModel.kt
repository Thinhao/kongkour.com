package com.chhurngsapplication.app.modules.amdpdfone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AmdPdfOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFour: String? = MyApp.getInstance().resources.getString(R.string.msg15)

)
