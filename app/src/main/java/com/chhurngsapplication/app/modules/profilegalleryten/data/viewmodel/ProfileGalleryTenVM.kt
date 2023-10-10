package com.chhurngsapplication.app.modules.profilegalleryten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryten.`data`.model.ProfileGalleryTenModel
import com.chhurngsapplication.app.modules.profilegalleryten.`data`.model.Staggered21RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryTenVM : ViewModel(), KoinComponent {
  val profileGalleryTenModel: MutableLiveData<ProfileGalleryTenModel> =
      MutableLiveData(ProfileGalleryTenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered21RowModel>> =
      MutableLiveData(mutableListOf())
}
