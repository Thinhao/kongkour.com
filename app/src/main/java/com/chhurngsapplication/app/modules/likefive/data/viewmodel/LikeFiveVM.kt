package com.chhurngsapplication.app.modules.likefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likefive.`data`.model.LikeFiveModel
import com.chhurngsapplication.app.modules.likefive.`data`.model.LikeFiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeFiveVM : ViewModel(), KoinComponent {
  val likeFiveModel: MutableLiveData<LikeFiveModel> = MutableLiveData(LikeFiveModel())

  var navArguments: Bundle? = null

  val likeFiveList: MutableLiveData<MutableList<LikeFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
