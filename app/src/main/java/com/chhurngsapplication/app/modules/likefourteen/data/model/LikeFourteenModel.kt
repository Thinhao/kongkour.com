package com.chhurngsapplication.app.modules.likefourteen.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeFourteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyNine: String? = MyApp.getInstance().resources.getString(R.string.msg8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt79kLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_9k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100comments: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_guys_this_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
