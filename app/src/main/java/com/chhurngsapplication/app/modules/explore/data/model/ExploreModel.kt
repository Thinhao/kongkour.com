package com.chhurngsapplication.app.modules.explore.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGallery: String? = MyApp.getInstance().resources.getString(R.string.lbl_gallery)

)
