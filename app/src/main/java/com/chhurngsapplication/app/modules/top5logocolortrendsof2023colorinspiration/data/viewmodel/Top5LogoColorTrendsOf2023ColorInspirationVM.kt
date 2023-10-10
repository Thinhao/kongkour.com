package com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspiration.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspiration.`data`.model.Top5LogoColorTrendsOf2023ColorInspirationModel
import org.koin.core.KoinComponent

class Top5LogoColorTrendsOf2023ColorInspirationVM : ViewModel(), KoinComponent {
  val top5LogoColorTrendsOf2023ColorInspirationModel:
      MutableLiveData<Top5LogoColorTrendsOf2023ColorInspirationModel> =
      MutableLiveData(Top5LogoColorTrendsOf2023ColorInspirationModel())

  var navArguments: Bundle? = null
}
