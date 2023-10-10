package com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.model.ProfileGalleryFourteenModel
import com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.model.Staggered3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryFourteenVM : ViewModel(), KoinComponent {
  val profileGalleryFourteenModel: MutableLiveData<ProfileGalleryFourteenModel> =
      MutableLiveData(ProfileGalleryFourteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered3RowModel>> =
      MutableLiveData(mutableListOf())
}
