package com.chhurngsapplication.app.modules.likethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likethree.`data`.model.LikeThreeModel
import com.chhurngsapplication.app.modules.likethree.`data`.model.LikeThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeThreeVM : ViewModel(), KoinComponent {
  val likeThreeModel: MutableLiveData<LikeThreeModel> = MutableLiveData(LikeThreeModel())

  var navArguments: Bundle? = null

  val likeThreeList: MutableLiveData<MutableList<LikeThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
