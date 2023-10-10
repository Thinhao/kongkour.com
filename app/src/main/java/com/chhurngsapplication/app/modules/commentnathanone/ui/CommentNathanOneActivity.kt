package com.chhurngsapplication.app.modules.commentnathanone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentNathanOneBinding
import com.chhurngsapplication.app.modules.commentnathanone.`data`.viewmodel.CommentNathanOneVM
import kotlin.String
import kotlin.Unit

class CommentNathanOneActivity :
    BaseActivity<ActivityCommentNathanOneBinding>(R.layout.activity_comment_nathan_one) {
  private val viewModel: CommentNathanOneVM by viewModels<CommentNathanOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentNathanOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_NATHAN_ONE_ACTIVITY"

  }
}
