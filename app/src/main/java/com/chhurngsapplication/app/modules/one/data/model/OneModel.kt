package com.chhurngsapplication.app.modules.one.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyThree: String? = MyApp.getInstance().resources.getString(R.string.msg3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatcoursesar: String? = MyApp.getInstance().resources.getString(R.string.msg16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchcourse: String? = MyApp.getInstance().resources.getString(R.string.msg17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFour: String? = MyApp.getInstance().resources.getString(R.string.msg18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.msg19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftySix: String? = MyApp.getInstance().resources.getString(R.string.lbl29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestTeachers: String? = MyApp.getInstance().resources.getString(R.string.lbl31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGordonNorman: String? = MyApp.getInstance().resources.getString(R.string.lbl_yi_hao)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUXUIDesigner: String? =
      MyApp.getInstance().resources.getString(R.string.msg_master_all_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etItemValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null
)
