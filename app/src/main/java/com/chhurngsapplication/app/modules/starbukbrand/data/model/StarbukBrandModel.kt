package com.chhurngsapplication.app.modules.starbukbrand.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StarbukBrandModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandGuideline: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brand_guideline3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStarbucks2014: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_starbucks_2014)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSTARBUCKSBrand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_starbucks_brand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThePurposeof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_purpose_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_we_are_pleased)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
