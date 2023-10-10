package com.chhurngsapplication.app.modules.likethree.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeThreeBinding
import com.chhurngsapplication.app.modules.likethree.`data`.model.LikeThreeRowModel
import com.chhurngsapplication.app.modules.likethree.`data`.viewmodel.LikeThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeThreeActivity : BaseActivity<ActivityLikeThreeBinding>(R.layout.activity_like_three) {
  private val viewModel: LikeThreeVM by viewModels<LikeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeThreeAdapter = LikeThreeAdapter(viewModel.likeThreeList.value?:mutableListOf())
    binding.recyclerLikeThree.adapter = likeThreeAdapter
    likeThreeAdapter.setOnItemClickListener(
    object : LikeThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeThreeRowModel) {
        onClickRecyclerLikeThree(view, position, item)
      }
    }
    )
    viewModel.likeThreeList.observe(this) {
      likeThreeAdapter.updateData(it)
    }
    binding.likeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeThree(
    view: View,
    position: Int,
    item: LikeThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_THREE_ACTIVITY"

  }
}
