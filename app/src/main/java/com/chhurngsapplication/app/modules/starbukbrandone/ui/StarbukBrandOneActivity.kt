package com.chhurngsapplication.app.modules.starbukbrandone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityStarbukBrandOneBinding
import com.chhurngsapplication.app.modules.starbukbrandone.`data`.viewmodel.StarbukBrandOneVM
import com.chhurngsapplication.app.modules.starbukpdfone.ui.StarbukPdfOneActivity
import kotlin.String
import kotlin.Unit

class StarbukBrandOneActivity :
    BaseActivity<ActivityStarbukBrandOneBinding>(R.layout.activity_starbuk_brand_one) {
  private val viewModel: StarbukBrandOneVM by viewModels<StarbukBrandOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.starbukBrandOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = StarbukPdfOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "STARBUK_BRAND_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StarbukBrandOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
