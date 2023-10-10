package com.chhurngsapplication.app.modules.commentmathin.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentMathinBinding
import com.chhurngsapplication.app.modules.commentmathin.`data`.viewmodel.CommentMathinVM
import kotlin.String
import kotlin.Unit

class CommentMathinActivity :
    BaseActivity<ActivityCommentMathinBinding>(R.layout.activity_comment_mathin) {
  private val viewModel: CommentMathinVM by viewModels<CommentMathinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentMathinVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_MATHIN_ACTIVITY"

  }
}
