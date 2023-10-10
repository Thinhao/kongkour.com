package com.chhurngsapplication.app.modules.fordpdfone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.fordpdfone.`data`.model.FordPdfOneModel
import org.koin.core.KoinComponent

class FordPdfOneVM : ViewModel(), KoinComponent {
  val fordPdfOneModel: MutableLiveData<FordPdfOneModel> = MutableLiveData(FordPdfOneModel())

  var navArguments: Bundle? = null
}
