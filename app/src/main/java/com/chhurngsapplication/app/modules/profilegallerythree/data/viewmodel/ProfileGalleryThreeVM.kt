package com.chhurngsapplication.app.modules.profilegallerythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerythree.`data`.model.ProfileGalleryThreeModel
import com.chhurngsapplication.app.modules.profilegallerythree.`data`.model.Staggered23RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryThreeVM : ViewModel(), KoinComponent {
  val profileGalleryThreeModel: MutableLiveData<ProfileGalleryThreeModel> =
      MutableLiveData(ProfileGalleryThreeModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered23RowModel>> =
      MutableLiveData(mutableListOf())
}
