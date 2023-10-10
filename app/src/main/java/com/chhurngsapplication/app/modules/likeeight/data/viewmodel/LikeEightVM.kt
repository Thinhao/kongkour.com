package com.chhurngsapplication.app.modules.likeeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likeeight.`data`.model.LikeEightModel
import com.chhurngsapplication.app.modules.likeeight.`data`.model.LikeEightRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeEightVM : ViewModel(), KoinComponent {
  val likeEightModel: MutableLiveData<LikeEightModel> = MutableLiveData(LikeEightModel())

  var navArguments: Bundle? = null

  val likeEightList: MutableLiveData<MutableList<LikeEightRowModel>> =
      MutableLiveData(mutableListOf())
}
