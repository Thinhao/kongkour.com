package com.chhurngsapplication.app.modules.commentmathinone.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CommentMathinOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChhurngMathin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chhurng_mathin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_5k_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_332_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_9_00_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_courses_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_darany)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_love_this_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaViaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_choum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaViaTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_chhorvon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_idea)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnandaViaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_chhaya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_highlight_point)

)
