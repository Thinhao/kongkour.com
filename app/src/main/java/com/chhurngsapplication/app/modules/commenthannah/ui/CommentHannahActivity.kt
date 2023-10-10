package com.chhurngsapplication.app.modules.commenthannah.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentHannahBinding
import com.chhurngsapplication.app.modules.commenthannah.`data`.viewmodel.CommentHannahVM
import kotlin.String
import kotlin.Unit

class CommentHannahActivity :
    BaseActivity<ActivityCommentHannahBinding>(R.layout.activity_comment_hannah) {
  private val viewModel: CommentHannahVM by viewModels<CommentHannahVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentHannahVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_HANNAH_ACTIVITY"

  }
}
