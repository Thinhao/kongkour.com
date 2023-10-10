package com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguideone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguideone.`data`.model.BrandGuidelinesExamplesToInspireYourBrandGuideOneModel
import org.koin.core.KoinComponent

class BrandGuidelinesExamplesToInspireYourBrandGuideOneVM : ViewModel(), KoinComponent {
  val brandGuidelinesExamplesToInspireYourBrandGuideOneModel:
      MutableLiveData<BrandGuidelinesExamplesToInspireYourBrandGuideOneModel> =
      MutableLiveData(BrandGuidelinesExamplesToInspireYourBrandGuideOneModel())

  var navArguments: Bundle? = null
}
