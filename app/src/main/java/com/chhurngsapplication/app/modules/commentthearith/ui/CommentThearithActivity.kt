package com.chhurngsapplication.app.modules.commentthearith.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentThearithBinding
import com.chhurngsapplication.app.modules.commentthearith.`data`.viewmodel.CommentThearithVM
import kotlin.String
import kotlin.Unit

class CommentThearithActivity :
    BaseActivity<ActivityCommentThearithBinding>(R.layout.activity_comment_thearith) {
  private val viewModel: CommentThearithVM by viewModels<CommentThearithVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentThearithVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COMMENT_THEARITH_ACTIVITY"

  }
}
