package com.chhurngsapplication.app.modules.commentscooperthree.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentScooperThreeBinding
import com.chhurngsapplication.app.modules.commentscooperthree.`data`.viewmodel.CommentScooperThreeVM
import kotlin.String
import kotlin.Unit

class CommentScooperThreeActivity :
    BaseActivity<ActivityCommentScooperThreeBinding>(R.layout.activity_comment_scooper_three) {
  private val viewModel: CommentScooperThreeVM by viewModels<CommentScooperThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentScooperThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SCOOPER_THREE_ACTIVITY"

  }
}
