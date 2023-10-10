package com.chhurngsapplication.app.modules.liketen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.liketen.`data`.model.LikeTenModel
import com.chhurngsapplication.app.modules.liketen.`data`.model.LikeTenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeTenVM : ViewModel(), KoinComponent {
  val likeTenModel: MutableLiveData<LikeTenModel> = MutableLiveData(LikeTenModel())

  var navArguments: Bundle? = null

  val likeTenList: MutableLiveData<MutableList<LikeTenRowModel>> = MutableLiveData(mutableListOf())
}
