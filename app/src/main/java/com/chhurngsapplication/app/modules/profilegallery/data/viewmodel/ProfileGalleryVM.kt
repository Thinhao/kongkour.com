package com.chhurngsapplication.app.modules.profilegallery.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallery.`data`.model.ProfileGalleryModel
import com.chhurngsapplication.app.modules.profilegallery.`data`.model.Staggered1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryVM : ViewModel(), KoinComponent {
  val profileGalleryModel: MutableLiveData<ProfileGalleryModel> =
      MutableLiveData(ProfileGalleryModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered1RowModel>> =
      MutableLiveData(mutableListOf())
}
