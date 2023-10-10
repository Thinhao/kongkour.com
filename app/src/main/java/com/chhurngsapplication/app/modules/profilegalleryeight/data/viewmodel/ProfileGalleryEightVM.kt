package com.chhurngsapplication.app.modules.profilegalleryeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryeight.`data`.model.ProfileGalleryEightModel
import com.chhurngsapplication.app.modules.profilegalleryeight.`data`.model.Staggered2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryEightVM : ViewModel(), KoinComponent {
  val profileGalleryEightModel: MutableLiveData<ProfileGalleryEightModel> =
      MutableLiveData(ProfileGalleryEightModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered2RowModel>> =
      MutableLiveData(mutableListOf())
}
