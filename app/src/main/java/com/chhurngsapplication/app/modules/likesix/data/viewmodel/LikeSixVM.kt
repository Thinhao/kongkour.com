package com.chhurngsapplication.app.modules.likesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likesix.`data`.model.LikeSixModel
import com.chhurngsapplication.app.modules.likesix.`data`.model.LikeSixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeSixVM : ViewModel(), KoinComponent {
  val likeSixModel: MutableLiveData<LikeSixModel> = MutableLiveData(LikeSixModel())

  var navArguments: Bundle? = null

  val likeSixList: MutableLiveData<MutableList<LikeSixRowModel>> = MutableLiveData(mutableListOf())
}
