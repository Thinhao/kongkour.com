package com.chhurngsapplication.app.modules.sixteen.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SixteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtELearning: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_learning2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatcoursesar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_courses_ar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoursetype: String? = MyApp.getInstance().resources.getString(R.string.lbl_course_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularcourses: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_courses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentCourses: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_courses)
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
