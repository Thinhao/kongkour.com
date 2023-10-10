package com.chhurngsapplication.app.modules.starbukbrand.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityStarbukBrandBinding
import com.chhurngsapplication.app.modules.starbukbrand.`data`.viewmodel.StarbukBrandVM
import com.chhurngsapplication.app.modules.starbukpdf.ui.StarbukPdfActivity
import kotlin.String
import kotlin.Unit

class StarbukBrandActivity :
    BaseActivity<ActivityStarbukBrandBinding>(R.layout.activity_starbuk_brand) {
  private val viewModel: StarbukBrandVM by viewModels<StarbukBrandVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.starbukBrandVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBrandGuidelinesOne.setOnClickListener {
      val destIntent = StarbukPdfActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "STARBUK_BRAND_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StarbukBrandActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
