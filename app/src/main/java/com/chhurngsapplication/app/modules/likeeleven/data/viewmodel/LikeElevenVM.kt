package com.chhurngsapplication.app.modules.likeeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likeeleven.`data`.model.LikeElevenModel
import com.chhurngsapplication.app.modules.likeeleven.`data`.model.LikeElevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeElevenVM : ViewModel(), KoinComponent {
  val likeElevenModel: MutableLiveData<LikeElevenModel> = MutableLiveData(LikeElevenModel())

  var navArguments: Bundle? = null

  val likeElevenList: MutableLiveData<MutableList<LikeElevenRowModel>> =
      MutableLiveData(mutableListOf())
}
