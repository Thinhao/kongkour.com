package com.chhurngsapplication.app.modules.amdpdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.amdpdf.`data`.model.AmdPdfModel
import org.koin.core.KoinComponent

class AmdPdfVM : ViewModel(), KoinComponent {
  val amdPdfModel: MutableLiveData<AmdPdfModel> = MutableLiveData(AmdPdfModel())

  var navArguments: Bundle? = null
}
