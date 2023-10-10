package com.chhurngsapplication.app.modules.amdbrand.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityAmdBrandBinding
import com.chhurngsapplication.app.modules.amdbrand.`data`.viewmodel.AmdBrandVM
import com.chhurngsapplication.app.modules.brandingpage.ui.BrandingPageActivity
import kotlin.String
import kotlin.Unit

class AmdBrandActivity : BaseActivity<ActivityAmdBrandBinding>(R.layout.activity_amd_brand) {
  private val viewModel: AmdBrandVM by viewModels<AmdBrandVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.amdBrandVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = BrandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AMD_BRAND_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AmdBrandActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
