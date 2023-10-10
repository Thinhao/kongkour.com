package com.chhurngsapplication.app.modules.cocacolapdf.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CocaColaPdfModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.msg15)

)
