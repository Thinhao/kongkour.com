package com.chhurngsapplication.app.modules.likeseven.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeSevenBinding
import com.chhurngsapplication.app.modules.likeseven.`data`.model.LikeSevenRowModel
import com.chhurngsapplication.app.modules.likeseven.`data`.viewmodel.LikeSevenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeSevenActivity : BaseActivity<ActivityLikeSevenBinding>(R.layout.activity_like_seven) {
  private val viewModel: LikeSevenVM by viewModels<LikeSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeSevenAdapter = LikeSevenAdapter(viewModel.likeSevenList.value?:mutableListOf())
    binding.recyclerLikeSeven.adapter = likeSevenAdapter
    likeSevenAdapter.setOnItemClickListener(
    object : LikeSevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeSevenRowModel) {
        onClickRecyclerLikeSeven(view, position, item)
      }
    }
    )
    viewModel.likeSevenList.observe(this) {
      likeSevenAdapter.updateData(it)
    }
    binding.likeSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeSeven(
    view: View,
    position: Int,
    item: LikeSevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_SEVEN_ACTIVITY"

  }
}
