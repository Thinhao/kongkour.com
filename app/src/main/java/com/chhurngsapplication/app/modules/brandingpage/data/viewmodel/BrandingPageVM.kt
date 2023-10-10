package com.chhurngsapplication.app.modules.brandingpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandingpage.`data`.model.BrandingPageModel
import com.chhurngsapplication.app.modules.brandingpage.`data`.model.BrandingPageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BrandingPageVM : ViewModel(), KoinComponent {
  val brandingPageModel: MutableLiveData<BrandingPageModel> = MutableLiveData(BrandingPageModel())

  var navArguments: Bundle? = null

  val brandingPageList: MutableLiveData<MutableList<BrandingPageRowModel>> =
      MutableLiveData(mutableListOf())
}
