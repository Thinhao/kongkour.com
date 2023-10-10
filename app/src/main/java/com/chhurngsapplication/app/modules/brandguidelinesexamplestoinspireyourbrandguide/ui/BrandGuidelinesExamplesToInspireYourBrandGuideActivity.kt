package com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguide.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandGuidelinesExamplesToInspireYourBrandGuideBinding
import com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguide.`data`.viewmodel.BrandGuidelinesExamplesToInspireYourBrandGuideVM
import kotlin.String
import kotlin.Unit

class BrandGuidelinesExamplesToInspireYourBrandGuideActivity :
    BaseActivity<ActivityBrandGuidelinesExamplesToInspireYourBrandGuideBinding>(R.layout.activity_brand_guidelines_examples_to_inspire_your_brand_guide)
    {
  private val viewModel: BrandGuidelinesExamplesToInspireYourBrandGuideVM by
      viewModels<BrandGuidelinesExamplesToInspireYourBrandGuideVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.brandGuidelinesExamplesToInspireYourBrandGuideVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BRAND_GUIDELINES_EXAMPLES_TO_INSPIRE_YOUR_BRAND_GUIDE_ACTIVITY"

  }
}
