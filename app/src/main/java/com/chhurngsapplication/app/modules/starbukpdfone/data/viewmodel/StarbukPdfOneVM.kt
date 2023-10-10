package com.chhurngsapplication.app.modules.starbukpdfone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.starbukpdfone.`data`.model.StarbukPdfOneModel
import org.koin.core.KoinComponent

class StarbukPdfOneVM : ViewModel(), KoinComponent {
  val starbukPdfOneModel: MutableLiveData<StarbukPdfOneModel> =
      MutableLiveData(StarbukPdfOneModel())

  var navArguments: Bundle? = null
}
