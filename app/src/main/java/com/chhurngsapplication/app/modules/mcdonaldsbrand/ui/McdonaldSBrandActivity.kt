package com.chhurngsapplication.app.modules.mcdonaldsbrand.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMcdonaldSBrandBinding
import com.chhurngsapplication.app.modules.mcdonaldsbrand.`data`.viewmodel.McdonaldSBrandVM
import com.chhurngsapplication.app.modules.mcdonalssbrandpdfone.ui.McdonalsSBrandPdfOneActivity
import kotlin.String
import kotlin.Unit

class McdonaldSBrandActivity :
    BaseActivity<ActivityMcdonaldSBrandBinding>(R.layout.activity_mcdonald_s_brand) {
  private val viewModel: McdonaldSBrandVM by viewModels<McdonaldSBrandVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mcdonaldSBrandVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btn.setOnClickListener {
      val destIntent = McdonalsSBrandPdfOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MCDONALD_S_BRAND_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, McdonaldSBrandActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
