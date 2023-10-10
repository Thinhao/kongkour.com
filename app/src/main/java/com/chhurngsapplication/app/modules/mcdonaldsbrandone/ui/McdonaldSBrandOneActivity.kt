package com.chhurngsapplication.app.modules.mcdonaldsbrandone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMcdonaldSBrandOneBinding
import com.chhurngsapplication.app.modules.mcdonaldsbrandone.`data`.viewmodel.McdonaldSBrandOneVM
import com.chhurngsapplication.app.modules.mcdonalssbrandpdf.ui.McdonalsSBrandPdfActivity
import kotlin.String
import kotlin.Unit

class McdonaldSBrandOneActivity :
    BaseActivity<ActivityMcdonaldSBrandOneBinding>(R.layout.activity_mcdonald_s_brand_one) {
  private val viewModel: McdonaldSBrandOneVM by viewModels<McdonaldSBrandOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mcdonaldSBrandOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnBrandGuidelinesOne.setOnClickListener {
      val destIntent = McdonalsSBrandPdfActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MCDONALD_S_BRAND_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, McdonaldSBrandOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
