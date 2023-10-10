package com.chhurngsapplication.app.modules.commentmathinthree.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentMathinThreeBinding
import com.chhurngsapplication.app.modules.commentmathinthree.`data`.viewmodel.CommentMathinThreeVM
import kotlin.String
import kotlin.Unit

class CommentMathinThreeActivity :
    BaseActivity<ActivityCommentMathinThreeBinding>(R.layout.activity_comment_mathin_three) {
  private val viewModel: CommentMathinThreeVM by viewModels<CommentMathinThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentMathinThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COMMENT_MATHIN_THREE_ACTIVITY"

  }
}
