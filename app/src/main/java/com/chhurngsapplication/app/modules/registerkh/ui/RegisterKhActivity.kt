package com.chhurngsapplication.app.modules.registerkh.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityRegisterKhBinding
import com.chhurngsapplication.app.modules.registerdone.ui.RegisterDoneActivity
import com.chhurngsapplication.app.modules.registeren.ui.RegisterEnActivity
import com.chhurngsapplication.app.modules.registerkh.`data`.viewmodel.RegisterKhVM
import kotlin.String
import kotlin.Unit

class RegisterKhActivity : BaseActivity<ActivityRegisterKhBinding>(R.layout.activity_register_kh) {
  private val viewModel: RegisterKhVM by viewModels<RegisterKhVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerKhVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearLanguageVarian.setOnClickListener {
      val destIntent = RegisterEnActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearButton.setOnClickListener {
      val destIntent = RegisterDoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btn.setOnClickListener {
      val destIntent = RegisterDoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_KH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterKhActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
