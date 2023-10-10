package com.chhurngsapplication.app.modules.starbukpdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.starbukpdf.`data`.model.StarbukPdfModel
import org.koin.core.KoinComponent

class StarbukPdfVM : ViewModel(), KoinComponent {
  val starbukPdfModel: MutableLiveData<StarbukPdfModel> = MutableLiveData(StarbukPdfModel())

  var navArguments: Bundle? = null
}
