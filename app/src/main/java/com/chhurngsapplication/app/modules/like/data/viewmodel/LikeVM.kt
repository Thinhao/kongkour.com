package com.chhurngsapplication.app.modules.like.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.like.`data`.model.LikeModel
import com.chhurngsapplication.app.modules.like.`data`.model.LikeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeVM : ViewModel(), KoinComponent {
  val likeModel: MutableLiveData<LikeModel> = MutableLiveData(LikeModel())

  var navArguments: Bundle? = null

  val likeList: MutableLiveData<MutableList<LikeRowModel>> = MutableLiveData(mutableListOf())
}
