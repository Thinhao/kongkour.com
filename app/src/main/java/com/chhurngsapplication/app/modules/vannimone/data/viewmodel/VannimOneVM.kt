package com.chhurngsapplication.app.modules.vannimone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.vannimone.`data`.model.VannimOneModel
import com.chhurngsapplication.app.modules.vannimone.`data`.model.VannimOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VannimOneVM : ViewModel(), KoinComponent {
  val vannimOneModel: MutableLiveData<VannimOneModel> = MutableLiveData(VannimOneModel())

  var navArguments: Bundle? = null

  val vannimOneList: MutableLiveData<MutableList<VannimOneRowModel>> =
      MutableLiveData(mutableListOf())
}
