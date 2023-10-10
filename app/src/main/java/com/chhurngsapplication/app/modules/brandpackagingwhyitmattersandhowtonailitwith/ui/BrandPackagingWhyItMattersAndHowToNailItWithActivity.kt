package com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwith.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandPackagingWhyItMattersAndHowToNailItWithBinding
import com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwith.`data`.viewmodel.BrandPackagingWhyItMattersAndHowToNailItWithVM
import kotlin.String
import kotlin.Unit

class BrandPackagingWhyItMattersAndHowToNailItWithActivity :
    BaseActivity<ActivityBrandPackagingWhyItMattersAndHowToNailItWithBinding>(R.layout.activity_brand_packaging_why_it_matters_and_how_to_nail_it_with)
    {
  private val viewModel: BrandPackagingWhyItMattersAndHowToNailItWithVM by
      viewModels<BrandPackagingWhyItMattersAndHowToNailItWithVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.brandPackagingWhyItMattersAndHowToNailItWithVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BRAND_PACKAGING_WHY_IT_MATTERS_AND_HOW_TO_NAIL_IT_WITH_ACTIVITY"

  }
}
