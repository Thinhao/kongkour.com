package com.chhurngsapplication.app.modules.fordpdf.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FordPdfModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyTwo: String? = MyApp.getInstance().resources.getString(R.string.msg15)

)
