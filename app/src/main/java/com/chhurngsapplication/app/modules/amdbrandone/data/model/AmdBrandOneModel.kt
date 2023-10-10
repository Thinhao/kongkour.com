package com.chhurngsapplication.app.modules.amdbrandone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AmdBrandOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_amd_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_amd_brand_guide)
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
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_these_guideline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
