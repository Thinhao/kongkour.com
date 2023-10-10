package com.chhurngsapplication.app.modules.amdpdfone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.amdpdfone.`data`.model.AmdPdfOneModel
import org.koin.core.KoinComponent

class AmdPdfOneVM : ViewModel(), KoinComponent {
  val amdPdfOneModel: MutableLiveData<AmdPdfOneModel> = MutableLiveData(AmdPdfOneModel())

  var navArguments: Bundle? = null
}
