package com.chhurngsapplication.app.modules.mcdonalssbrandpdf.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class McdonalsSBrandPdfModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandGuideline: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brand_guideline3)

)
