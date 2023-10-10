package com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.model.ProfileGallerySeventeenModel
import com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.model.Staggered16RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGallerySeventeenVM : ViewModel(), KoinComponent {
  val profileGallerySeventeenModel: MutableLiveData<ProfileGallerySeventeenModel> =
      MutableLiveData(ProfileGallerySeventeenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered16RowModel>> =
      MutableLiveData(mutableListOf())
}
