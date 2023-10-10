package com.chhurngsapplication.app.modules.commentscooper.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentScooperBinding
import com.chhurngsapplication.app.modules.commentscooper.`data`.viewmodel.CommentScooperVM
import kotlin.String
import kotlin.Unit

class CommentScooperActivity :
    BaseActivity<ActivityCommentScooperBinding>(R.layout.activity_comment_scooper) {
  private val viewModel: CommentScooperVM by viewModels<CommentScooperVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentScooperVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SCOOPER_ACTIVITY"

  }
}
