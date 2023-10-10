package com.chhurngsapplication.app.modules.coursedetailfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetailfive.`data`.model.CoursedetailFiveModel
import com.chhurngsapplication.app.modules.coursedetailfive.`data`.model.Datalist3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailFiveVM : ViewModel(), KoinComponent {
  val coursedetailFiveModel: MutableLiveData<CoursedetailFiveModel> =
      MutableLiveData(CoursedetailFiveModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<Datalist3RowModel>> =
      MutableLiveData(mutableListOf())
}
