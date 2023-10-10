package com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.model.ProfileGalleryEighteenModel
import com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.model.Staggered11RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGalleryEighteenVM : ViewModel(), KoinComponent {
  val profileGalleryEighteenModel: MutableLiveData<ProfileGalleryEighteenModel> =
      MutableLiveData(ProfileGalleryEighteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered11RowModel>> =
      MutableLiveData(mutableListOf())
}
