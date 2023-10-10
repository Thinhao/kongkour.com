package com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwith.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwith.`data`.model.BrandPackagingWhyItMattersAndHowToNailItWithModel
import org.koin.core.KoinComponent

class BrandPackagingWhyItMattersAndHowToNailItWithVM : ViewModel(), KoinComponent {
  val brandPackagingWhyItMattersAndHowToNailItWithModel:
      MutableLiveData<BrandPackagingWhyItMattersAndHowToNailItWithModel> =
      MutableLiveData(BrandPackagingWhyItMattersAndHowToNailItWithModel())

  var navArguments: Bundle? = null
}
