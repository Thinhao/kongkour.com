package com.chhurngsapplication.app.modules.coursedetailfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetailfour.`data`.model.CoursedetailFourModel
import com.chhurngsapplication.app.modules.coursedetailfour.`data`.model.Datalist1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailFourVM : ViewModel(), KoinComponent {
  val coursedetailFourModel: MutableLiveData<CoursedetailFourModel> =
      MutableLiveData(CoursedetailFourModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<Datalist1RowModel>> =
      MutableLiveData(mutableListOf())
}
