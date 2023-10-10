package com.chhurngsapplication.app.modules.likefifteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeFifteenBinding
import com.chhurngsapplication.app.modules.likefifteen.`data`.model.LikeFifteenRowModel
import com.chhurngsapplication.app.modules.likefifteen.`data`.viewmodel.LikeFifteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeFifteenActivity : BaseActivity<ActivityLikeFifteenBinding>(R.layout.activity_like_fifteen)
    {
  private val viewModel: LikeFifteenVM by viewModels<LikeFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeFifteenAdapter =
    LikeFifteenAdapter(viewModel.likeFifteenList.value?:mutableListOf())
    binding.recyclerLikeFifteen.adapter = likeFifteenAdapter
    likeFifteenAdapter.setOnItemClickListener(
    object : LikeFifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeFifteenRowModel) {
        onClickRecyclerLikeFifteen(view, position, item)
      }
    }
    )
    viewModel.likeFifteenList.observe(this) {
      likeFifteenAdapter.updateData(it)
    }
    binding.likeFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeFifteen(
    view: View,
    position: Int,
    item: LikeFifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_FIFTEEN_ACTIVITY"

  }
}
