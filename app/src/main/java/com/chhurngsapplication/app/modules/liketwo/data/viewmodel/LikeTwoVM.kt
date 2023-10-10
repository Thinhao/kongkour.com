package com.chhurngsapplication.app.modules.liketwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.liketwo.`data`.model.LikeTwoModel
import com.chhurngsapplication.app.modules.liketwo.`data`.model.LikeTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeTwoVM : ViewModel(), KoinComponent {
  val likeTwoModel: MutableLiveData<LikeTwoModel> = MutableLiveData(LikeTwoModel())

  var navArguments: Bundle? = null

  val likeTwoList: MutableLiveData<MutableList<LikeTwoRowModel>> = MutableLiveData(mutableListOf())
}
