package com.chhurngsapplication.app.modules.profilegalleryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryone.`data`.model.ProfileGalleryOneModel
import com.chhurngsapplication.app.modules.profilegalleryone.`data`.model.Staggered22RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryOneVM : ViewModel(), KoinComponent {
  val profileGalleryOneModel: MutableLiveData<ProfileGalleryOneModel> =
      MutableLiveData(ProfileGalleryOneModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered22RowModel>> =
      MutableLiveData(mutableListOf())
}
