package com.chhurngsapplication.app.modules.mcdonaldsbrand.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class McdonaldSBrandModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.msg15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMcDonalds2019: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mcdonald_s_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_mcdonald_s_bra)
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
      MyApp.getInstance().resources.getString(R.string.msg_mcdonald_s_is_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_directed_by_tyl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
