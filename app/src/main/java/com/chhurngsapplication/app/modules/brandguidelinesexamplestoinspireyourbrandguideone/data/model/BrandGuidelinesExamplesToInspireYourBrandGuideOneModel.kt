package com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguideone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BrandGuidelinesExamplesToInspireYourBrandGuideOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_branding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4BrandGuideli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_brand_guideli)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtByVannim: String? = MyApp.getInstance().resources.getString(R.string.lbl_by_vannim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brand_guideline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhattoInclude: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_to_include)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brand_guideline2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_logo_acceptabl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt15Inspiringbr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_15_inspiring_br)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt15brandguidel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_15_brand_guidel2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSonosCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_sonos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGlossierCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_glossier)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOatlyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_oatly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirbnbCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_airbnb)

)
