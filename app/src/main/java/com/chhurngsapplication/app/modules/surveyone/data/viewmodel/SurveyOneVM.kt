package com.chhurngsapplication.app.modules.surveyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.surveyone.`data`.model.SurveyOneModel
import com.chhurngsapplication.app.modules.surveyone.`data`.model.SurveyOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SurveyOneVM : ViewModel(), KoinComponent {
  val surveyOneModel: MutableLiveData<SurveyOneModel> = MutableLiveData(SurveyOneModel())

  var navArguments: Bundle? = null

  val surveyOneList: MutableLiveData<MutableList<SurveyOneRowModel>> =
      MutableLiveData(mutableListOf())
}
