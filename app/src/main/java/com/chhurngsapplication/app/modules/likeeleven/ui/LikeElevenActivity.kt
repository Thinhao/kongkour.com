package com.chhurngsapplication.app.modules.likeeleven.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeElevenBinding
import com.chhurngsapplication.app.modules.likeeleven.`data`.model.LikeElevenRowModel
import com.chhurngsapplication.app.modules.likeeleven.`data`.viewmodel.LikeElevenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeElevenActivity : BaseActivity<ActivityLikeElevenBinding>(R.layout.activity_like_eleven) {
  private val viewModel: LikeElevenVM by viewModels<LikeElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeElevenAdapter = LikeElevenAdapter(viewModel.likeElevenList.value?:mutableListOf())
    binding.recyclerLikeEleven.adapter = likeElevenAdapter
    likeElevenAdapter.setOnItemClickListener(
    object : LikeElevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeElevenRowModel) {
        onClickRecyclerLikeEleven(view, position, item)
      }
    }
    )
    viewModel.likeElevenList.observe(this) {
      likeElevenAdapter.updateData(it)
    }
    binding.likeElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeEleven(
    view: View,
    position: Int,
    item: LikeElevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_ELEVEN_ACTIVITY"

  }
}
