package com.chhurngsapplication.app.modules.fordpdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.fordpdf.`data`.model.FordPdfModel
import org.koin.core.KoinComponent

class FordPdfVM : ViewModel(), KoinComponent {
  val fordPdfModel: MutableLiveData<FordPdfModel> = MutableLiveData(FordPdfModel())

  var navArguments: Bundle? = null
}
