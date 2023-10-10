package com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwithone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandPackagingWhyItMattersAndHowToNailItWithOneBinding
import com.chhurngsapplication.app.modules.brandpackagingwhyitmattersandhowtonailitwithone.`data`.viewmodel.BrandPackagingWhyItMattersAndHowToNailItWithOneVM
import kotlin.String
import kotlin.Unit

class BrandPackagingWhyItMattersAndHowToNailItWithOneActivity :
    BaseActivity<ActivityBrandPackagingWhyItMattersAndHowToNailItWithOneBinding>(R.layout.activity_brand_packaging_why_it_matters_and_how_to_nail_it_with_one)
    {
  private val viewModel: BrandPackagingWhyItMattersAndHowToNailItWithOneVM by
      viewModels<BrandPackagingWhyItMattersAndHowToNailItWithOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.brandPackagingWhyItMattersAndHowToNailItWithOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BRAND_PACKAGING_WHY_IT_MATTERS_AND_HOW_TO_NAIL_IT_WITH_ONE_ACTIVITY"

  }
}
