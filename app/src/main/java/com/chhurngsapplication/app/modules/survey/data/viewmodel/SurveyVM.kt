package com.chhurngsapplication.app.modules.survey.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.survey.`data`.model.SurveyModel
import com.chhurngsapplication.app.modules.survey.`data`.model.SurveyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SurveyVM : ViewModel(), KoinComponent {
  val surveyModel: MutableLiveData<SurveyModel> = MutableLiveData(SurveyModel())

  var navArguments: Bundle? = null

  val surveyList: MutableLiveData<MutableList<SurveyRowModel>> = MutableLiveData(mutableListOf())
}
