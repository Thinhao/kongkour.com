package com.chhurngsapplication.app.modules.surveyone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SurveyOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_learning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotography: String? = MyApp.getInstance().resources.getString(R.string.lbl_photography)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_digital_marketi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_graphic_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_branding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_creative_f)

)
