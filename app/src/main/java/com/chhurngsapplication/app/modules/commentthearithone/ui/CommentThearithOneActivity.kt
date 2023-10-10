package com.chhurngsapplication.app.modules.commentthearithone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentThearithOneBinding
import com.chhurngsapplication.app.modules.commentthearithone.`data`.viewmodel.CommentThearithOneVM
import kotlin.String
import kotlin.Unit

class CommentThearithOneActivity :
    BaseActivity<ActivityCommentThearithOneBinding>(R.layout.activity_comment_thearith_one) {
  private val viewModel: CommentThearithOneVM by viewModels<CommentThearithOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentThearithOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COMMENT_THEARITH_ONE_ACTIVITY"

  }
}
