package com.chhurngsapplication.app.modules.mcdonalssbrandpdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mcdonalssbrandpdf.`data`.model.McdonalsSBrandPdfModel
import org.koin.core.KoinComponent

class McdonalsSBrandPdfVM : ViewModel(), KoinComponent {
  val mcdonalsSBrandPdfModel: MutableLiveData<McdonalsSBrandPdfModel> =
      MutableLiveData(McdonalsSBrandPdfModel())

  var navArguments: Bundle? = null
}
