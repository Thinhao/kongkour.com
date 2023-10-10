package com.chhurngsapplication.app.modules.cocacolabrandone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CocaColaBrandOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortySeven: String? = MyApp.getInstance().resources.getString(R.string.msg15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocaCola2020: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_coca_cola_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCocaColaBrand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_coca_cola_brand)
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
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_simply_put_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)

)
