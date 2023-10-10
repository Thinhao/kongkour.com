package com.chhurngsapplication.app.modules.brandingpage.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BrandingPageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHowtoBuilda: String? = MyApp.getInstance().resources.getString(R.string.msg_how_to_build_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnhowtobu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_how_to_bu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviewsTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
