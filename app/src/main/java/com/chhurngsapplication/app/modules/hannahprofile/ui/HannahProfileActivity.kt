package com.chhurngsapplication.app.modules.hannahprofile.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahProfileBinding
import com.chhurngsapplication.app.modules.hannahprofile.`data`.model.HannahProfileRowModel
import com.chhurngsapplication.app.modules.hannahprofile.`data`.viewmodel.HannahProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HannahProfileActivity :
    BaseActivity<ActivityHannahProfileBinding>(R.layout.activity_hannah_profile) {
  private val viewModel: HannahProfileVM by viewModels<HannahProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val hannahProfileAdapter =
    HannahProfileAdapter(viewModel.hannahProfileList.value?:mutableListOf())
    binding.recyclerHannahProfile.adapter = hannahProfileAdapter
    hannahProfileAdapter.setOnItemClickListener(
    object : HannahProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HannahProfileRowModel) {
        onClickRecyclerHannahProfile(view, position, item)
      }
    }
    )
    viewModel.hannahProfileList.observe(this) {
      hannahProfileAdapter.updateData(it)
    }
    binding.hannahProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHannahProfile(
    view: View,
    position: Int,
    item: HannahProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HANNAH_PROFILE_ACTIVITY"

  }
}
