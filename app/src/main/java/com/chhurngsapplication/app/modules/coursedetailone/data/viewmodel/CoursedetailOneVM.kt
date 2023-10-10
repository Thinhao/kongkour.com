package com.chhurngsapplication.app.modules.coursedetailone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetailone.`data`.model.CoursedetailOneModel
import com.chhurngsapplication.app.modules.coursedetailone.`data`.model.DatalistRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailOneVM : ViewModel(), KoinComponent {
  val coursedetailOneModel: MutableLiveData<CoursedetailOneModel> =
      MutableLiveData(CoursedetailOneModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<DatalistRowModel>> =
      MutableLiveData(mutableListOf())
}
