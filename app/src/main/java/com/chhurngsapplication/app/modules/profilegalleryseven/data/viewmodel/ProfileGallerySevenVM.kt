package com.chhurngsapplication.app.modules.profilegalleryseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryseven.`data`.model.ProfileGallerySevenModel
import com.chhurngsapplication.app.modules.profilegalleryseven.`data`.model.Staggered13RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGallerySevenVM : ViewModel(), KoinComponent {
  val profileGallerySevenModel: MutableLiveData<ProfileGallerySevenModel> =
      MutableLiveData(ProfileGallerySevenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered13RowModel>> =
      MutableLiveData(mutableListOf())
}
