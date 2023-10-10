package com.chhurngsapplication.app.modules.profilegalleryfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryfour.`data`.model.ProfileGalleryFourModel
import com.chhurngsapplication.app.modules.profilegalleryfour.`data`.model.Staggered15RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryFourVM : ViewModel(), KoinComponent {
  val profileGalleryFourModel: MutableLiveData<ProfileGalleryFourModel> =
      MutableLiveData(ProfileGalleryFourModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered15RowModel>> =
      MutableLiveData(mutableListOf())
}
