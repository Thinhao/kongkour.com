package com.chhurngsapplication.app.modules.commentmathinone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentMathinOneBinding
import com.chhurngsapplication.app.modules.commentmathinone.`data`.viewmodel.CommentMathinOneVM
import kotlin.String
import kotlin.Unit

class CommentMathinOneActivity :
    BaseActivity<ActivityCommentMathinOneBinding>(R.layout.activity_comment_mathin_one) {
  private val viewModel: CommentMathinOneVM by viewModels<CommentMathinOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentMathinOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COMMENT_MATHIN_ONE_ACTIVITY"

  }
}
