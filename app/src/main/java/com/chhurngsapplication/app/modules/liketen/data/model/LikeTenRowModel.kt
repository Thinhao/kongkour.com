package com.chhurngsapplication.app.modules.liketen.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeTenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_ananda_via)

)
