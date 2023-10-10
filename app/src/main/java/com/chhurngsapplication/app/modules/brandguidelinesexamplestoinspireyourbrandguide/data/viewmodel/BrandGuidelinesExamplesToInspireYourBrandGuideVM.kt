package com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguide.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguide.`data`.model.BrandGuidelinesExamplesToInspireYourBrandGuideModel
import org.koin.core.KoinComponent

class BrandGuidelinesExamplesToInspireYourBrandGuideVM : ViewModel(), KoinComponent {
  val brandGuidelinesExamplesToInspireYourBrandGuideModel:
      MutableLiveData<BrandGuidelinesExamplesToInspireYourBrandGuideModel> =
      MutableLiveData(BrandGuidelinesExamplesToInspireYourBrandGuideModel())

  var navArguments: Bundle? = null
}
