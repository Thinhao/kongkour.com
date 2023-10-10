package com.chhurngsapplication.app.modules.mcdonalssbrandpdfone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mcdonalssbrandpdfone.`data`.model.McdonalsSBrandPdfOneModel
import org.koin.core.KoinComponent

class McdonalsSBrandPdfOneVM : ViewModel(), KoinComponent {
  val mcdonalsSBrandPdfOneModel: MutableLiveData<McdonalsSBrandPdfOneModel> =
      MutableLiveData(McdonalsSBrandPdfOneModel())

  var navArguments: Bundle? = null
}
