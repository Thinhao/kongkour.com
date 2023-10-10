package com.chhurngsapplication.app.modules.hannahprofilethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahprofilethree.`data`.model.HannahProfileThreeModel
import com.chhurngsapplication.app.modules.hannahprofilethree.`data`.model.StaggeredrectangleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HannahProfileThreeVM : ViewModel(), KoinComponent {
  val hannahProfileThreeModel: MutableLiveData<HannahProfileThreeModel> =
      MutableLiveData(HannahProfileThreeModel())

  var navArguments: Bundle? = null

  val staggeredrectangleList: MutableLiveData<MutableList<StaggeredrectangleRowModel>> =
      MutableLiveData(mutableListOf())
}
