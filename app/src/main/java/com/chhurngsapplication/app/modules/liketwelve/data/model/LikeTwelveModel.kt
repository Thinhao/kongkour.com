package com.chhurngsapplication.app.modules.liketwelve.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeTwelveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileAppdesi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mobile_app_desi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
