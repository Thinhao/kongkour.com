package com.chhurngsapplication.app.modules.profilegallerynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerynine.`data`.model.ProfileGalleryNineModel
import com.chhurngsapplication.app.modules.profilegallerynine.`data`.model.Staggered8RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryNineVM : ViewModel(), KoinComponent {
  val profileGalleryNineModel: MutableLiveData<ProfileGalleryNineModel> =
      MutableLiveData(ProfileGalleryNineModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered8RowModel>> =
      MutableLiveData(mutableListOf())
}
