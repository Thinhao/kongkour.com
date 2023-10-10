package com.chhurngsapplication.app.modules.mcdonalssbrandpdf.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMcdonalsSBrandPdfBinding
import com.chhurngsapplication.app.modules.mcdonaldsbrandone.ui.McdonaldSBrandOneActivity
import com.chhurngsapplication.app.modules.mcdonalssbrandpdf.`data`.viewmodel.McdonalsSBrandPdfVM
import kotlin.String
import kotlin.Unit

class McdonalsSBrandPdfActivity :
    BaseActivity<ActivityMcdonalsSBrandPdfBinding>(R.layout.activity_mcdonals_s_brand_pdf) {
  private val viewModel: McdonalsSBrandPdfVM by viewModels<McdonalsSBrandPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mcdonalsSBrandPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = McdonaldSBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MCDONALS_S_BRAND_PDF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, McdonalsSBrandPdfActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
