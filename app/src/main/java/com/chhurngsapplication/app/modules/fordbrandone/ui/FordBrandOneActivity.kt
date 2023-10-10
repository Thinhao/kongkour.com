package com.chhurngsapplication.app.modules.fordbrandone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFordBrandOneBinding
import com.chhurngsapplication.app.modules.fordbrandone.`data`.viewmodel.FordBrandOneVM
import com.chhurngsapplication.app.modules.fordpdfone.ui.FordPdfOneActivity
import kotlin.String
import kotlin.Unit

class FordBrandOneActivity :
    BaseActivity<ActivityFordBrandOneBinding>(R.layout.activity_ford_brand_one) {
  private val viewModel: FordBrandOneVM by viewModels<FordBrandOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fordBrandOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnBrandGuidelinesOne.setOnClickListener {
      val destIntent = FordPdfOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORD_BRAND_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FordBrandOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
