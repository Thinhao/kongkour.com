package com.chhurngsapplication.app.modules.coursedetailthree.`data`.model

import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CoursedetailThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt456peopleatte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_456_people_atte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt234discussion: String? =
      MyApp.getInstance().resources.getString(R.string.msg_234_discussion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCourseContent: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_course_content)

)
