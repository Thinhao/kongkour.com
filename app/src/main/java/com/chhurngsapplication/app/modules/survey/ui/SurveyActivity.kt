package com.chhurngsapplication.app.modules.survey.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivitySurveyBinding
import com.chhurngsapplication.app.modules.registerone.ui.RegisterOneActivity
import com.chhurngsapplication.app.modules.survey.`data`.model.SurveyRowModel
import com.chhurngsapplication.app.modules.survey.`data`.viewmodel.SurveyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SurveyActivity : BaseActivity<ActivitySurveyBinding>(R.layout.activity_survey) {
  private val viewModel: SurveyVM by viewModels<SurveyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val surveyAdapter = SurveyAdapter(viewModel.surveyList.value?:mutableListOf())
    binding.recyclerSurvey.adapter = surveyAdapter
    surveyAdapter.setOnItemClickListener(
    object : SurveyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SurveyRowModel) {
        onClickRecyclerSurvey(view, position, item)
      }
    }
    )
    viewModel.surveyList.observe(this) {
      surveyAdapter.updateData(it)
    }
    binding.surveyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = RegisterOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSurvey(
    view: View,
    position: Int,
    item: SurveyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SURVEY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SurveyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
