package com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwithone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwithone.`data`.model.BrandPackagingWhyItMattersAndHowToNailItWithOneModel
import org.koin.core.KoinComponent

class BrandPackagingWhyItMattersAndHowToNailItWithOneVM : ViewModel(), KoinComponent {
  val brandPackagingWhyItMattersAndHowToNailItWithOneModel:
      MutableLiveData<BrandPackagingWhyItMattersAndHowToNailItWithOneModel> =
      MutableLiveData(BrandPackagingWhyItMattersAndHowToNailItWithOneModel())

  var navArguments: Bundle? = null
}
