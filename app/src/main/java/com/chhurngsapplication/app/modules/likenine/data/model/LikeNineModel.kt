package com.chhurngsapplication.app.modules.likenine.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LikeNineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyFour: String? = MyApp.getInstance().resources.getString(R.string.msg8)
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
  var txtMyBestArtworkOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_best_artwork)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)

)
