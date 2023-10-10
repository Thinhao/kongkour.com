package com.chhurngsapplication.app.modules.likeone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeOneBinding
import com.chhurngsapplication.app.modules.likeone.`data`.model.LikeOneRowModel
import com.chhurngsapplication.app.modules.likeone.`data`.viewmodel.LikeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeOneActivity : BaseActivity<ActivityLikeOneBinding>(R.layout.activity_like_one) {
  private val viewModel: LikeOneVM by viewModels<LikeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeOneAdapter = LikeOneAdapter(viewModel.likeOneList.value?:mutableListOf())
    binding.recyclerLikeOne.adapter = likeOneAdapter
    likeOneAdapter.setOnItemClickListener(
    object : LikeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeOneRowModel) {
        onClickRecyclerLikeOne(view, position, item)
      }
    }
    )
    viewModel.likeOneList.observe(this) {
      likeOneAdapter.updateData(it)
    }
    binding.likeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeOne(
    view: View,
    position: Int,
    item: LikeOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_ONE_ACTIVITY"

  }
}
