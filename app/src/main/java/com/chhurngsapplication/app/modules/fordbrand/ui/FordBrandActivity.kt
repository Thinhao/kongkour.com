package com.chhurngsapplication.app.modules.fordbrand.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFordBrandBinding
import com.chhurngsapplication.app.modules.fordbrand.`data`.viewmodel.FordBrandVM
import com.chhurngsapplication.app.modules.fordpdf.ui.FordPdfActivity
import kotlin.String
import kotlin.Unit

class FordBrandActivity : BaseActivity<ActivityFordBrandBinding>(R.layout.activity_ford_brand) {
  private val viewModel: FordBrandVM by viewModels<FordBrandVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fordBrandVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btn.setOnClickListener {
      val destIntent = FordPdfActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORD_BRAND_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FordBrandActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
