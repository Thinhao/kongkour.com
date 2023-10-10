package com.chhurngsapplication.app.modules.profilegallerytwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwenty.`data`.model.ProfileGalleryTwentyModel
import com.chhurngsapplication.app.modules.profilegallerytwenty.`data`.model.Staggered6RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwentyVM : ViewModel(), KoinComponent {
  val profileGalleryTwentyModel: MutableLiveData<ProfileGalleryTwentyModel> =
      MutableLiveData(ProfileGalleryTwentyModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered6RowModel>> =
      MutableLiveData(mutableListOf())
}
