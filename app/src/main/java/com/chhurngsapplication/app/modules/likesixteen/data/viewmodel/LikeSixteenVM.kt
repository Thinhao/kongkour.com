package com.chhurngsapplication.app.modules.likesixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likesixteen.`data`.model.LikeSixteenModel
import com.chhurngsapplication.app.modules.likesixteen.`data`.model.LikeSixteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeSixteenVM : ViewModel(), KoinComponent {
  val likeSixteenModel: MutableLiveData<LikeSixteenModel> = MutableLiveData(LikeSixteenModel())

  var navArguments: Bundle? = null

  val likeSixteenList: MutableLiveData<MutableList<LikeSixteenRowModel>> =
      MutableLiveData(mutableListOf())
}
