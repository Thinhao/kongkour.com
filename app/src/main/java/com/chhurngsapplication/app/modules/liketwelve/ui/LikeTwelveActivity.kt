package com.chhurngsapplication.app.modules.liketwelve.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeTwelveBinding
import com.chhurngsapplication.app.modules.liketwelve.`data`.model.LikeTwelveRowModel
import com.chhurngsapplication.app.modules.liketwelve.`data`.viewmodel.LikeTwelveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeTwelveActivity : BaseActivity<ActivityLikeTwelveBinding>(R.layout.activity_like_twelve) {
  private val viewModel: LikeTwelveVM by viewModels<LikeTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeTwelveAdapter = LikeTwelveAdapter(viewModel.likeTwelveList.value?:mutableListOf())
    binding.recyclerLikeTwelve.adapter = likeTwelveAdapter
    likeTwelveAdapter.setOnItemClickListener(
    object : LikeTwelveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeTwelveRowModel) {
        onClickRecyclerLikeTwelve(view, position, item)
      }
    }
    )
    viewModel.likeTwelveList.observe(this) {
      likeTwelveAdapter.updateData(it)
    }
    binding.likeTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeTwelve(
    view: View,
    position: Int,
    item: LikeTwelveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_TWELVE_ACTIVITY"

  }
}
