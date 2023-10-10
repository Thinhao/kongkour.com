package com.chhurngsapplication.app.modules.like.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeBinding
import com.chhurngsapplication.app.modules.like.`data`.model.LikeRowModel
import com.chhurngsapplication.app.modules.like.`data`.viewmodel.LikeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeActivity : BaseActivity<ActivityLikeBinding>(R.layout.activity_like) {
  private val viewModel: LikeVM by viewModels<LikeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeAdapter = LikeAdapter(viewModel.likeList.value?:mutableListOf())
    binding.recyclerLike.adapter = likeAdapter
    likeAdapter.setOnItemClickListener(
    object : LikeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeRowModel) {
        onClickRecyclerLike(view, position, item)
      }
    }
    )
    viewModel.likeList.observe(this) {
      likeAdapter.updateData(it)
    }
    binding.likeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLike(
    view: View,
    position: Int,
    item: LikeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_ACTIVITY"

  }
}
