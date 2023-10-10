package com.chhurngsapplication.app.modules.starbukpdfone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StarbukPdfOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.msg15)

)
