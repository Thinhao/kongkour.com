package com.chhurngsapplication.app.modules.coursedetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetail.`data`.model.CoursedetailModel
import com.chhurngsapplication.app.modules.coursedetail.`data`.model.Datalist4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailVM : ViewModel(), KoinComponent {
  val coursedetailModel: MutableLiveData<CoursedetailModel> = MutableLiveData(CoursedetailModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<Datalist4RowModel>> =
      MutableLiveData(mutableListOf())
}
