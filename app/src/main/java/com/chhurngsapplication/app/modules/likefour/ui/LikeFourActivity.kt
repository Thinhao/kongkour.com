package com.chhurngsapplication.app.modules.likefour.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeFourBinding
import com.chhurngsapplication.app.modules.likefour.`data`.model.LikeFourRowModel
import com.chhurngsapplication.app.modules.likefour.`data`.viewmodel.LikeFourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeFourActivity : BaseActivity<ActivityLikeFourBinding>(R.layout.activity_like_four) {
  private val viewModel: LikeFourVM by viewModels<LikeFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeFourAdapter = LikeFourAdapter(viewModel.likeFourList.value?:mutableListOf())
    binding.recyclerLikeFour.adapter = likeFourAdapter
    likeFourAdapter.setOnItemClickListener(
    object : LikeFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeFourRowModel) {
        onClickRecyclerLikeFour(view, position, item)
      }
    }
    )
    viewModel.likeFourList.observe(this) {
      likeFourAdapter.updateData(it)
    }
    binding.likeFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeFour(
    view: View,
    position: Int,
    item: LikeFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_FOUR_ACTIVITY"

  }
}
