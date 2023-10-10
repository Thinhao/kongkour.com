package com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.model.ProfileGalleryThirteenModel
import com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.model.Staggered18RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryThirteenVM : ViewModel(), KoinComponent {
  val profileGalleryThirteenModel: MutableLiveData<ProfileGalleryThirteenModel> =
      MutableLiveData(ProfileGalleryThirteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered18RowModel>> =
      MutableLiveData(mutableListOf())
}
