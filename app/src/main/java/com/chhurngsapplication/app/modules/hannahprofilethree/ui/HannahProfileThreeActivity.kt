package com.chhurngsapplication.app.modules.hannahprofilethree.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahProfileThreeBinding
import com.chhurngsapplication.app.modules.hannahprofilethree.`data`.model.StaggeredrectangleRowModel
import com.chhurngsapplication.app.modules.hannahprofilethree.`data`.viewmodel.HannahProfileThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HannahProfileThreeActivity :
    BaseActivity<ActivityHannahProfileThreeBinding>(R.layout.activity_hannah_profile_three) {
  private val viewModel: HannahProfileThreeVM by viewModels<HannahProfileThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredrectangleAdapter =
    StaggeredrectangleAdapter(viewModel.staggeredrectangleList.value?:mutableListOf())
    binding.recyclerStaggeredrectangle.adapter = staggeredrectangleAdapter
    staggeredrectangleAdapter.setOnItemClickListener(
    object : StaggeredrectangleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredrectangleRowModel) {
        onClickRecyclerStaggeredrectangle(view, position, item)
      }
    }
    )
    viewModel.staggeredrectangleList.observe(this) {
      staggeredrectangleAdapter.updateData(it)
    }
    binding.hannahProfileThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggeredrectangle(
    view: View,
    position: Int,
    item: StaggeredrectangleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HANNAH_PROFILE_THREE_ACTIVITY"

  }
}
