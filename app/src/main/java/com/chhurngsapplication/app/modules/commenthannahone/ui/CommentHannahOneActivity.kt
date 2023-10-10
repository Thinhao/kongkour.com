package com.chhurngsapplication.app.modules.commenthannahone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentHannahOneBinding
import com.chhurngsapplication.app.modules.commenthannahone.`data`.viewmodel.CommentHannahOneVM
import kotlin.String
import kotlin.Unit

class CommentHannahOneActivity :
    BaseActivity<ActivityCommentHannahOneBinding>(R.layout.activity_comment_hannah_one) {
  private val viewModel: CommentHannahOneVM by viewModels<CommentHannahOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentHannahOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_HANNAH_ONE_ACTIVITY"

  }
}
