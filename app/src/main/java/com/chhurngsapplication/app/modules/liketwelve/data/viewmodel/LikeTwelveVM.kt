package com.chhurngsapplication.app.modules.liketwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.liketwelve.`data`.model.LikeTwelveModel
import com.chhurngsapplication.app.modules.liketwelve.`data`.model.LikeTwelveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeTwelveVM : ViewModel(), KoinComponent {
  val likeTwelveModel: MutableLiveData<LikeTwelveModel> = MutableLiveData(LikeTwelveModel())

  var navArguments: Bundle? = null

  val likeTwelveList: MutableLiveData<MutableList<LikeTwelveRowModel>> =
      MutableLiveData(mutableListOf())
}
