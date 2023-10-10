package com.chhurngsapplication.app.modules.registerone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityRegisterOneBinding
import com.chhurngsapplication.app.modules.registerone.`data`.viewmodel.RegisterOneVM
import kotlin.String
import kotlin.Unit

class RegisterOneActivity : BaseActivity<ActivityRegisterOneBinding>(R.layout.activity_register_one)
    {
  private val viewModel: RegisterOneVM by viewModels<RegisterOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTER_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
