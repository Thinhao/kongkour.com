package com.chhurngsapplication.app.modules.registerone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUrsulaGurnmeis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chhurng_mathin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_graphic_design3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUrsulaGurnmeisOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_thearith)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaidyouviaBe: String? = MyApp.getInstance().resources.getString(R.string.lbl_photography)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUrsulaGurnmeisTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hannah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_graphic_design3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_scooper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3d_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr_nathan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_photographer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl17)

)
