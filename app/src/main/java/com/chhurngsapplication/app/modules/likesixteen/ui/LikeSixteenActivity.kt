package com.chhurngsapplication.app.modules.likesixteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeSixteenBinding
import com.chhurngsapplication.app.modules.likesixteen.`data`.model.LikeSixteenRowModel
import com.chhurngsapplication.app.modules.likesixteen.`data`.viewmodel.LikeSixteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeSixteenActivity : BaseActivity<ActivityLikeSixteenBinding>(R.layout.activity_like_sixteen)
    {
  private val viewModel: LikeSixteenVM by viewModels<LikeSixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeSixteenAdapter =
    LikeSixteenAdapter(viewModel.likeSixteenList.value?:mutableListOf())
    binding.recyclerLikeSixteen.adapter = likeSixteenAdapter
    likeSixteenAdapter.setOnItemClickListener(
    object : LikeSixteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeSixteenRowModel) {
        onClickRecyclerLikeSixteen(view, position, item)
      }
    }
    )
    viewModel.likeSixteenList.observe(this) {
      likeSixteenAdapter.updateData(it)
    }
    binding.likeSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeSixteen(
    view: View,
    position: Int,
    item: LikeSixteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_SIXTEEN_ACTIVITY"

  }
}
