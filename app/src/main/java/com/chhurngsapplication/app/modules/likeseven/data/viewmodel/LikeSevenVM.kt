package com.chhurngsapplication.app.modules.likeseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likeseven.`data`.model.LikeSevenModel
import com.chhurngsapplication.app.modules.likeseven.`data`.model.LikeSevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeSevenVM : ViewModel(), KoinComponent {
  val likeSevenModel: MutableLiveData<LikeSevenModel> = MutableLiveData(LikeSevenModel())

  var navArguments: Bundle? = null

  val likeSevenList: MutableLiveData<MutableList<LikeSevenRowModel>> =
      MutableLiveData(mutableListOf())
}
