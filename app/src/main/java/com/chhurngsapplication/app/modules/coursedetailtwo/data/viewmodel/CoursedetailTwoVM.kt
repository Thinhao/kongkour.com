package com.chhurngsapplication.app.modules.coursedetailtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.coursedetailtwo.`data`.model.CoursedetailTwoModel
import com.chhurngsapplication.app.modules.coursedetailtwo.`data`.model.Datalist2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CoursedetailTwoVM : ViewModel(), KoinComponent {
  val coursedetailTwoModel: MutableLiveData<CoursedetailTwoModel> =
      MutableLiveData(CoursedetailTwoModel())

  var navArguments: Bundle? = null

  val dataListList: MutableLiveData<MutableList<Datalist2RowModel>> =
      MutableLiveData(mutableListOf())
}
