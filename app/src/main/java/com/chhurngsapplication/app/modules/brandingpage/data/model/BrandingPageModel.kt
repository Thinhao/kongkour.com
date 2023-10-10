package com.chhurngsapplication.app.modules.brandingpage.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BrandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBranding: String? = MyApp.getInstance().resources.getString(R.string.lbl_branding2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularBrands: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_brands)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_documents_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_amd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDESIGNGUIDELIN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_design_guidelin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_documents_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviews: String? = MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_ford)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDESIGNGUIDELINOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_design_guidelin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5046reviewsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_0_46_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandPackaging: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brand_packaging)

)
