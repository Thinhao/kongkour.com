package com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguideone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandGuidelinesExamplesToInspireYourBrandGuideOneBinding
import com.chhurngsapplication.app.modules.brandguidelinesexamplestoinspireyourbrandguideone.`data`.viewmodel.BrandGuidelinesExamplesToInspireYourBrandGuideOneVM
import kotlin.String
import kotlin.Unit

class BrandGuidelinesExamplesToInspireYourBrandGuideOneActivity :
    BaseActivity<ActivityBrandGuidelinesExamplesToInspireYourBrandGuideOneBinding>(R.layout.activity_brand_guidelines_examples_to_inspire_your_brand_guide_one)
    {
  private val viewModel: BrandGuidelinesExamplesToInspireYourBrandGuideOneVM by
      viewModels<BrandGuidelinesExamplesToInspireYourBrandGuideOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.brandGuidelinesExamplesToInspireYourBrandGuideOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BRAND_GUIDELINES_EXAMPLES_TO_INSPIRE_YOUR_BRAND_GUIDE_ONE_ACTIVITY"

  }
}
