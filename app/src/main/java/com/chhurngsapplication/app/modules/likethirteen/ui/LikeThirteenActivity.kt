package com.chhurngsapplication.app.modules.likethirteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeThirteenBinding
import com.chhurngsapplication.app.modules.likethirteen.`data`.model.LikeThirteenRowModel
import com.chhurngsapplication.app.modules.likethirteen.`data`.viewmodel.LikeThirteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeThirteenActivity :
    BaseActivity<ActivityLikeThirteenBinding>(R.layout.activity_like_thirteen) {
  private val viewModel: LikeThirteenVM by viewModels<LikeThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeThirteenAdapter =
    LikeThirteenAdapter(viewModel.likeThirteenList.value?:mutableListOf())
    binding.recyclerLikeThirteen.adapter = likeThirteenAdapter
    likeThirteenAdapter.setOnItemClickListener(
    object : LikeThirteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeThirteenRowModel) {
        onClickRecyclerLikeThirteen(view, position, item)
      }
    }
    )
    viewModel.likeThirteenList.observe(this) {
      likeThirteenAdapter.updateData(it)
    }
    binding.likeThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeThirteen(
    view: View,
    position: Int,
    item: LikeThirteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_THIRTEEN_ACTIVITY"

  }
}
