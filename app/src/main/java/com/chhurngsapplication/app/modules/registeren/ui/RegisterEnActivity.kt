package com.chhurngsapplication.app.modules.registeren.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.appcomponents.googleauth.GoogleHelper
import com.chhurngsapplication.app.databinding.ActivityRegisterEnBinding
import com.chhurngsapplication.app.modules.registerdoneone.ui.RegisterDoneOneActivity
import com.chhurngsapplication.app.modules.registeren.`data`.viewmodel.RegisterEnVM
import com.chhurngsapplication.app.modules.registerkh.ui.RegisterKhActivity
import kotlin.String
import kotlin.Unit

class RegisterEnActivity : BaseActivity<ActivityRegisterEnBinding>(R.layout.activity_register_en) {
  private val viewModel: RegisterEnVM by viewModels<RegisterEnVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerEnVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearButton.setOnClickListener {
        googleLogin.login()
      }
      binding.btnLogin.setOnClickListener {
        val destIntent = RegisterDoneOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.frameKHFlag.setOnClickListener {
        val destIntent = RegisterKhActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "REGISTER_EN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RegisterEnActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
