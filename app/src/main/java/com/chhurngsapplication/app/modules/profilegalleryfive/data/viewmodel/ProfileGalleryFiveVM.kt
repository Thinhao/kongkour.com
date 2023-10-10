package com.chhurngsapplication.app.modules.profilegalleryfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryfive.`data`.model.ProfileGalleryFiveModel
import com.chhurngsapplication.app.modules.profilegalleryfive.`data`.model.Staggered5RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryFiveVM : ViewModel(), KoinComponent {
  val profileGalleryFiveModel: MutableLiveData<ProfileGalleryFiveModel> =
      MutableLiveData(ProfileGalleryFiveModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered5RowModel>> =
      MutableLiveData(mutableListOf())
}
