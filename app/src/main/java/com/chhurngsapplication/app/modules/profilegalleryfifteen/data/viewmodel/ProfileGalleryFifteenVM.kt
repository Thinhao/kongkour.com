package com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.model.ProfileGalleryFifteenModel
import com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.model.Staggered9RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryFifteenVM : ViewModel(), KoinComponent {
  val profileGalleryFifteenModel: MutableLiveData<ProfileGalleryFifteenModel> =
      MutableLiveData(ProfileGalleryFifteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered9RowModel>> =
      MutableLiveData(mutableListOf())
}
