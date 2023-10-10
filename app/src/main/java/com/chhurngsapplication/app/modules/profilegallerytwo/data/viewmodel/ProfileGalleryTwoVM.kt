package com.chhurngsapplication.app.modules.profilegallerytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerytwo.`data`.model.ProfileGalleryTwoModel
import com.chhurngsapplication.app.modules.profilegallerytwo.`data`.model.Staggered10RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTwoVM : ViewModel(), KoinComponent {
  val profileGalleryTwoModel: MutableLiveData<ProfileGalleryTwoModel> =
      MutableLiveData(ProfileGalleryTwoModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered10RowModel>> =
      MutableLiveData(mutableListOf())
}
