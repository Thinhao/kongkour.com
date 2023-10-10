package com.chhurngsapplication.app.modules.commentmathintwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentMathinTwoBinding
import com.chhurngsapplication.app.modules.commentmathintwo.`data`.viewmodel.CommentMathinTwoVM
import kotlin.String
import kotlin.Unit

class CommentMathinTwoActivity :
    BaseActivity<ActivityCommentMathinTwoBinding>(R.layout.activity_comment_mathin_two) {
  private val viewModel: CommentMathinTwoVM by viewModels<CommentMathinTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentMathinTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_MATHIN_TWO_ACTIVITY"

  }
}
