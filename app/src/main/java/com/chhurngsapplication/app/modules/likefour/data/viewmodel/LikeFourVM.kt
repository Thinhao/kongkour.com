package com.chhurngsapplication.app.modules.likefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likefour.`data`.model.LikeFourModel
import com.chhurngsapplication.app.modules.likefour.`data`.model.LikeFourRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeFourVM : ViewModel(), KoinComponent {
  val likeFourModel: MutableLiveData<LikeFourModel> = MutableLiveData(LikeFourModel())

  var navArguments: Bundle? = null

  val likeFourList: MutableLiveData<MutableList<LikeFourRowModel>> =
      MutableLiveData(mutableListOf())
}
