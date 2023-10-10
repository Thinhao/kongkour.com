package com.chhurngsapplication.app.modules.hannahprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahprofileone.`data`.model.HannahProfileOneModel
import com.chhurngsapplication.app.modules.hannahprofileone.`data`.model.Staggeredrectangle2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HannahProfileOneVM : ViewModel(), KoinComponent {
  val hannahProfileOneModel: MutableLiveData<HannahProfileOneModel> =
      MutableLiveData(HannahProfileOneModel())

  var navArguments: Bundle? = null

  val staggeredrectangleList: MutableLiveData<MutableList<Staggeredrectangle2RowModel>> =
      MutableLiveData(mutableListOf())
}
