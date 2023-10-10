package com.chhurngsapplication.app.modules.exploreone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl34)

)
