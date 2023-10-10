package com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.model.ProfileGalleryNineteenModel
import com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.model.Staggered4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryNineteenVM : ViewModel(), KoinComponent {
  val profileGalleryNineteenModel: MutableLiveData<ProfileGalleryNineteenModel> =
      MutableLiveData(ProfileGalleryNineteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered4RowModel>> =
      MutableLiveData(mutableListOf())
}
