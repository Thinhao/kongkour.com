package com.chhurngsapplication.app.modules.likeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likeone.`data`.model.LikeOneModel
import com.chhurngsapplication.app.modules.likeone.`data`.model.LikeOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeOneVM : ViewModel(), KoinComponent {
  val likeOneModel: MutableLiveData<LikeOneModel> = MutableLiveData(LikeOneModel())

  var navArguments: Bundle? = null

  val likeOneList: MutableLiveData<MutableList<LikeOneRowModel>> = MutableLiveData(mutableListOf())
}
