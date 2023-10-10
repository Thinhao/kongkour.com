package com.chhurngsapplication.app.modules.amdbrandone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityAmdBrandOneBinding
import com.chhurngsapplication.app.modules.amdbrandone.`data`.viewmodel.AmdBrandOneVM
import com.chhurngsapplication.app.modules.brandingpageone.ui.BrandingPageOneActivity
import kotlin.String
import kotlin.Unit

class AmdBrandOneActivity :
    BaseActivity<ActivityAmdBrandOneBinding>(R.layout.activity_amd_brand_one) {
  private val viewModel: AmdBrandOneVM by viewModels<AmdBrandOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.amdBrandOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = BrandingPageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AMD_BRAND_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AmdBrandOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
