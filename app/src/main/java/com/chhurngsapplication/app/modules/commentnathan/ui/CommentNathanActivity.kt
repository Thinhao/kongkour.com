package com.chhurngsapplication.app.modules.commentnathan.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentNathanBinding
import com.chhurngsapplication.app.modules.commentnathan.`data`.viewmodel.CommentNathanVM
import kotlin.String
import kotlin.Unit

class CommentNathanActivity :
    BaseActivity<ActivityCommentNathanBinding>(R.layout.activity_comment_nathan) {
  private val viewModel: CommentNathanVM by viewModels<CommentNathanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentNathanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_NATHAN_ACTIVITY"

  }
}
