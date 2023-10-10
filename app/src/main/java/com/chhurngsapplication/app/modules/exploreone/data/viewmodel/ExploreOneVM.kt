package com.chhurngsapplication.app.modules.exploreone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.exploreone.`data`.model.ExploreOneModel
import com.chhurngsapplication.app.modules.exploreone.`data`.model.ExploreOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExploreOneVM : ViewModel(), KoinComponent {
  val exploreOneModel: MutableLiveData<ExploreOneModel> = MutableLiveData(ExploreOneModel())

  var navArguments: Bundle? = null

  val exploreOneList: MutableLiveData<MutableList<ExploreOneRowModel>> =
      MutableLiveData(mutableListOf())
}
