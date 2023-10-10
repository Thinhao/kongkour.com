package com.chhurngsapplication.app.modules.surveyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivitySurveyOneBinding
import com.chhurngsapplication.app.modules.register.ui.RegisterActivity
import com.chhurngsapplication.app.modules.surveyone.`data`.model.SurveyOneRowModel
import com.chhurngsapplication.app.modules.surveyone.`data`.viewmodel.SurveyOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SurveyOneActivity : BaseActivity<ActivitySurveyOneBinding>(R.layout.activity_survey_one) {
  private val viewModel: SurveyOneVM by viewModels<SurveyOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val surveyOneAdapter = SurveyOneAdapter(viewModel.surveyOneList.value?:mutableListOf())
    binding.recyclerSurveyOne.adapter = surveyOneAdapter
    surveyOneAdapter.setOnItemClickListener(
    object : SurveyOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SurveyOneRowModel) {
        onClickRecyclerSurveyOne(view, position, item)
      }
    }
    )
    viewModel.surveyOneList.observe(this) {
      surveyOneAdapter.updateData(it)
    }
    binding.surveyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSurveyOne(
    view: View,
    position: Int,
    item: SurveyOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SURVEY_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SurveyOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
