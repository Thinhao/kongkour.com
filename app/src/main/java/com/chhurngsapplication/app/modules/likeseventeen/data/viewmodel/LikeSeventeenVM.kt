package com.chhurngsapplication.app.modules.likeseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likeseventeen.`data`.model.LikeSeventeenModel
import com.chhurngsapplication.app.modules.likeseventeen.`data`.model.ListellipsefortythreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeSeventeenVM : ViewModel(), KoinComponent {
  val likeSeventeenModel: MutableLiveData<LikeSeventeenModel> =
      MutableLiveData(LikeSeventeenModel())

  var navArguments: Bundle? = null

  val listellipsefortythreeList: MutableLiveData<MutableList<ListellipsefortythreeRowModel>> =
      MutableLiveData(mutableListOf())
}
