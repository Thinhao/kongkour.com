package com.chhurngsapplication.app.modules.hannahprofiletwo.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahProfileTwoBinding
import com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.model.Staggeredrectangle1RowModel
import com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.viewmodel.HannahProfileTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HannahProfileTwoActivity :
    BaseActivity<ActivityHannahProfileTwoBinding>(R.layout.activity_hannah_profile_two) {
  private val viewModel: HannahProfileTwoVM by viewModels<HannahProfileTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredrectangleAdapter =
    StaggeredrectangleAdapter(viewModel.staggeredrectangleList.value?:mutableListOf())
    binding.recyclerStaggeredrectangle.adapter = staggeredrectangleAdapter
    staggeredrectangleAdapter.setOnItemClickListener(
    object : StaggeredrectangleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggeredrectangle1RowModel) {
        onClickRecyclerStaggeredrectangle(view, position, item)
      }
    }
    )
    viewModel.staggeredrectangleList.observe(this) {
      staggeredrectangleAdapter.updateData(it)
    }
    binding.hannahProfileTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggeredrectangle(
    view: View,
    position: Int,
    item: Staggeredrectangle1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HANNAH_PROFILE_TWO_ACTIVITY"

  }
}
