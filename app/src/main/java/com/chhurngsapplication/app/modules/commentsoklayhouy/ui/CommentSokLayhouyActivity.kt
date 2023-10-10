package com.chhurngsapplication.app.modules.commentsoklayhouy.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentSokLayhouyBinding
import com.chhurngsapplication.app.modules.commentsoklayhouy.`data`.viewmodel.CommentSokLayhouyVM
import kotlin.String
import kotlin.Unit

class CommentSokLayhouyActivity :
    BaseActivity<ActivityCommentSokLayhouyBinding>(R.layout.activity_comment_sok_layhouy) {
  private val viewModel: CommentSokLayhouyVM by viewModels<CommentSokLayhouyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentSokLayhouyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SOK_LAYHOUY_ACTIVITY"

  }
}
