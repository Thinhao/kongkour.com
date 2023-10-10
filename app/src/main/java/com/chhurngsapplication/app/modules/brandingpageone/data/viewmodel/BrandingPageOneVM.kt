package com.chhurngsapplication.app.modules.brandingpageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandingpageone.`data`.model.BrandingPageOneModel
import com.chhurngsapplication.app.modules.brandingpageone.`data`.model.ListplaceyourdesiThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BrandingPageOneVM : ViewModel(), KoinComponent {
  val brandingPageOneModel: MutableLiveData<BrandingPageOneModel> =
      MutableLiveData(BrandingPageOneModel())

  var navArguments: Bundle? = null

  val listplaceyourdesiThreeList: MutableLiveData<MutableList<ListplaceyourdesiThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
