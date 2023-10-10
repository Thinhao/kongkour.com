package com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.model.ProfileGalleryElevenModel
import com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.model.Staggered17RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryElevenVM : ViewModel(), KoinComponent {
  val profileGalleryElevenModel: MutableLiveData<ProfileGalleryElevenModel> =
      MutableLiveData(ProfileGalleryElevenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered17RowModel>> =
      MutableLiveData(mutableListOf())
}
