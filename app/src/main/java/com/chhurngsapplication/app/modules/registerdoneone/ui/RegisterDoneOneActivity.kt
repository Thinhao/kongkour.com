package com.chhurngsapplication.app.modules.registerdoneone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityRegisterDoneOneBinding
import com.chhurngsapplication.app.modules.registerdoneone.`data`.viewmodel.RegisterDoneOneVM
import com.chhurngsapplication.app.modules.surveyone.ui.SurveyOneActivity
import kotlin.String
import kotlin.Unit

class RegisterDoneOneActivity :
    BaseActivity<ActivityRegisterDoneOneBinding>(R.layout.activity_register_done_one) {
  private val viewModel: RegisterDoneOneVM by viewModels<RegisterDoneOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerDoneOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRegisterdone.setOnClickListener {
      val destIntent = SurveyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumngetstarted.setOnClickListener {
      val destIntent = SurveyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_DONE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterDoneOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
