package com.chhurngsapplication.app.modules.vannim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.vannim.`data`.model.VannimModel
import com.chhurngsapplication.app.modules.vannim.`data`.model.VannimRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VannimVM : ViewModel(), KoinComponent {
  val vannimModel: MutableLiveData<VannimModel> = MutableLiveData(VannimModel())

  var navArguments: Bundle? = null

  val vannimList: MutableLiveData<MutableList<VannimRowModel>> = MutableLiveData(mutableListOf())
}
