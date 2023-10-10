package com.chhurngsapplication.app.modules.commentscoopertwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentScooperTwoBinding
import com.chhurngsapplication.app.modules.commentscoopertwo.`data`.viewmodel.CommentScooperTwoVM
import kotlin.String
import kotlin.Unit

class CommentScooperTwoActivity :
    BaseActivity<ActivityCommentScooperTwoBinding>(R.layout.activity_comment_scooper_two) {
  private val viewModel: CommentScooperTwoVM by viewModels<CommentScooperTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentScooperTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SCOOPER_TWO_ACTIVITY"

  }
}
