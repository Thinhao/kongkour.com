package com.chhurngsapplication.app.modules.hannahprofileone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahProfileOneBinding
import com.chhurngsapplication.app.modules.hannahprofileone.`data`.model.Staggeredrectangle2RowModel
import com.chhurngsapplication.app.modules.hannahprofileone.`data`.viewmodel.HannahProfileOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HannahProfileOneActivity :
    BaseActivity<ActivityHannahProfileOneBinding>(R.layout.activity_hannah_profile_one) {
  private val viewModel: HannahProfileOneVM by viewModels<HannahProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredrectangleAdapter =
    StaggeredrectangleAdapter(viewModel.staggeredrectangleList.value?:mutableListOf())
    binding.recyclerStaggeredrectangle.adapter = staggeredrectangleAdapter
    staggeredrectangleAdapter.setOnItemClickListener(
    object : StaggeredrectangleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggeredrectangle2RowModel) {
        onClickRecyclerStaggeredrectangle(view, position, item)
      }
    }
    )
    viewModel.staggeredrectangleList.observe(this) {
      staggeredrectangleAdapter.updateData(it)
    }
    binding.hannahProfileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggeredrectangle(
    view: View,
    position: Int,
    item: Staggeredrectangle2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HANNAH_PROFILE_ONE_ACTIVITY"

  }
}
