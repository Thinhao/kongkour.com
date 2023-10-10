package com.chhurngsapplication.app.modules.commentsotheaone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentSotheaOneBinding
import com.chhurngsapplication.app.modules.commentsotheaone.`data`.viewmodel.CommentSotheaOneVM
import kotlin.String
import kotlin.Unit

class CommentSotheaOneActivity :
    BaseActivity<ActivityCommentSotheaOneBinding>(R.layout.activity_comment_sothea_one) {
  private val viewModel: CommentSotheaOneVM by viewModels<CommentSotheaOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentSotheaOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SOTHEA_ONE_ACTIVITY"

  }
}
