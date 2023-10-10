package com.chhurngsapplication.app.modules.cocacolabrand.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCocaColaBrandBinding
import com.chhurngsapplication.app.modules.cocacolabrand.`data`.viewmodel.CocaColaBrandVM
import com.chhurngsapplication.app.modules.cocacolapdfone.ui.CocaColaPdfOneActivity
import kotlin.String
import kotlin.Unit

class CocaColaBrandActivity :
    BaseActivity<ActivityCocaColaBrandBinding>(R.layout.activity_coca_cola_brand) {
  private val viewModel: CocaColaBrandVM by viewModels<CocaColaBrandVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cocaColaBrandVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBrandGuidelinesOne.setOnClickListener {
      val destIntent = CocaColaPdfOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COCA_COLA_BRAND_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CocaColaBrandActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
