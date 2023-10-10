package com.chhurngsapplication.app.modules.likeeight.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeEightBinding
import com.chhurngsapplication.app.modules.likeeight.`data`.model.LikeEightRowModel
import com.chhurngsapplication.app.modules.likeeight.`data`.viewmodel.LikeEightVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeEightActivity : BaseActivity<ActivityLikeEightBinding>(R.layout.activity_like_eight) {
  private val viewModel: LikeEightVM by viewModels<LikeEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeEightAdapter = LikeEightAdapter(viewModel.likeEightList.value?:mutableListOf())
    binding.recyclerLikeEight.adapter = likeEightAdapter
    likeEightAdapter.setOnItemClickListener(
    object : LikeEightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeEightRowModel) {
        onClickRecyclerLikeEight(view, position, item)
      }
    }
    )
    viewModel.likeEightList.observe(this) {
      likeEightAdapter.updateData(it)
    }
    binding.likeEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeEight(
    view: View,
    position: Int,
    item: LikeEightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_EIGHT_ACTIVITY"

  }
}
