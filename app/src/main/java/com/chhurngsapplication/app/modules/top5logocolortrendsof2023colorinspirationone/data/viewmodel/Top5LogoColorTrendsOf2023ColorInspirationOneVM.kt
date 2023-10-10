package com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspirationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspirationone.`data`.model.Top5LogoColorTrendsOf2023ColorInspirationOneModel
import org.koin.core.KoinComponent

class Top5LogoColorTrendsOf2023ColorInspirationOneVM : ViewModel(), KoinComponent {
  val top5LogoColorTrendsOf2023ColorInspirationOneModel:
      MutableLiveData<Top5LogoColorTrendsOf2023ColorInspirationOneModel> =
      MutableLiveData(Top5LogoColorTrendsOf2023ColorInspirationOneModel())

  var navArguments: Bundle? = null
}
