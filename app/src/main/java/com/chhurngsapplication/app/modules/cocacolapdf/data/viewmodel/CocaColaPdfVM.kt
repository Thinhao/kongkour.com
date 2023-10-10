package com.chhurngsapplication.app.modules.cocacolapdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.cocacolapdf.`data`.model.CocaColaPdfModel
import org.koin.core.KoinComponent

class CocaColaPdfVM : ViewModel(), KoinComponent {
  val cocaColaPdfModel: MutableLiveData<CocaColaPdfModel> = MutableLiveData(CocaColaPdfModel())

  var navArguments: Bundle? = null
}
