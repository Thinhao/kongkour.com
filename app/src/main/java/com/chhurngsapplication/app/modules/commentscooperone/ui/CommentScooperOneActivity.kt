package com.chhurngsapplication.app.modules.commentscooperone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentScooperOneBinding
import com.chhurngsapplication.app.modules.commentscooperone.`data`.viewmodel.CommentScooperOneVM
import kotlin.String
import kotlin.Unit

class CommentScooperOneActivity :
    BaseActivity<ActivityCommentScooperOneBinding>(R.layout.activity_comment_scooper_one) {
  private val viewModel: CommentScooperOneVM by viewModels<CommentScooperOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentScooperOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SCOOPER_ONE_ACTIVITY"

  }
}
