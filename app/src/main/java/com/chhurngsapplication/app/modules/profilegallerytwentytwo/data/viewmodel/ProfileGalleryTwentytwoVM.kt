package com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.model.ProfileGalleryTwentytwoModel
import com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.model.Staggered7RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwentytwoVM : ViewModel(), KoinComponent {
  val profileGalleryTwentytwoModel: MutableLiveData<ProfileGalleryTwentytwoModel> =
      MutableLiveData(ProfileGalleryTwentytwoModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered7RowModel>> =
      MutableLiveData(mutableListOf())
}
