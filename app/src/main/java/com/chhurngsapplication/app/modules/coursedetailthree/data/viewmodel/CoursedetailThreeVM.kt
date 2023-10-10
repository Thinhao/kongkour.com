package com.chhurngsapplication.app.modules.coursedetailthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetailthree.`data`.model.CoursedetailThreeModel
import com.chhurngsapplication.app.modules.coursedetailthree.`data`.model.Datalist5RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailThreeVM : ViewModel(), KoinComponent {
  val coursedetailThreeModel: MutableLiveData<CoursedetailThreeModel> =
      MutableLiveData(CoursedetailThreeModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<Datalist5RowModel>> =
      MutableLiveData(mutableListOf())
}
