package com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileGalleryThirteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHannah: String? = MyApp.getInstance().resources.getString(R.string.lbl_hannah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_80m_follower2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterprenure: String? = MyApp.getInstance().resources.getString(R.string.lbl_enterprenure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl10)

)
