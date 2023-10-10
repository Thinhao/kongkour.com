package com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.model.ProfileGalleryTwelveModel
import com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.model.Staggered14RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwelveVM : ViewModel(), KoinComponent {
  val profileGalleryTwelveModel: MutableLiveData<ProfileGalleryTwelveModel> =
      MutableLiveData(ProfileGalleryTwelveModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered14RowModel>> =
      MutableLiveData(mutableListOf())
}
