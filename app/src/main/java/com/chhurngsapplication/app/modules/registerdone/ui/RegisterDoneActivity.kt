package com.chhurngsapplication.app.modules.registerdone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityRegisterDoneBinding
import com.chhurngsapplication.app.modules.registerdone.`data`.viewmodel.RegisterDoneVM
import com.chhurngsapplication.app.modules.survey.ui.SurveyActivity
import kotlin.String
import kotlin.Unit

class RegisterDoneActivity :
    BaseActivity<ActivityRegisterDoneBinding>(R.layout.activity_register_done) {
  private val viewModel: RegisterDoneVM by viewModels<RegisterDoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerDoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStacklogin.setOnClickListener {
      val destIntent = SurveyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegisterdone.setOnClickListener {
      val destIntent = SurveyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_DONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterDoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
