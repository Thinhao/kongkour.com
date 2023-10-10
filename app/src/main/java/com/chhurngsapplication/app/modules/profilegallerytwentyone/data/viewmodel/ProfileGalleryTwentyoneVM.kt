package com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.model.ProfileGalleryTwentyoneModel
import com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.model.Staggered20RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwentyoneVM : ViewModel(), KoinComponent {
  val profileGalleryTwentyoneModel: MutableLiveData<ProfileGalleryTwentyoneModel> =
      MutableLiveData(ProfileGalleryTwentyoneModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered20RowModel>> =
      MutableLiveData(mutableListOf())
}
