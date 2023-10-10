package com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.model.ProfileGalleryTwentythreeModel
import com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.model.StaggeredRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwentythreeVM : ViewModel(), KoinComponent {
  val profileGalleryTwentythreeModel: MutableLiveData<ProfileGalleryTwentythreeModel> =
      MutableLiveData(ProfileGalleryTwentythreeModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<StaggeredRowModel>> =
      MutableLiveData(mutableListOf())
}
