package com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.model.ProfileGallerySixteenModel
import com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.model.Staggered12RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGallerySixteenVM : ViewModel(), KoinComponent {
  val profileGallerySixteenModel: MutableLiveData<ProfileGallerySixteenModel> =
      MutableLiveData(ProfileGallerySixteenModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered12RowModel>> =
      MutableLiveData(mutableListOf())
}
