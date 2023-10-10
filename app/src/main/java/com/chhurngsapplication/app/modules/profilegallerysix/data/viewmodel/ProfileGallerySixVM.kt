package com.chhurngsapplication.app.modules.profilegallerysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.profilegallerysix.`data`.model.ProfileGallerySixModel
import com.chhurngsapplication.app.modules.profilegallerysix.`data`.model.Staggered19RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileGallerySixVM : ViewModel(), KoinComponent {
  val profileGallerySixModel: MutableLiveData<ProfileGallerySixModel> =
      MutableLiveData(ProfileGallerySixModel())

  var navArguments: Bundle? = null

  val staggeredList: MutableLiveData<MutableList<Staggered19RowModel>> =
      MutableLiveData(mutableListOf())
}
