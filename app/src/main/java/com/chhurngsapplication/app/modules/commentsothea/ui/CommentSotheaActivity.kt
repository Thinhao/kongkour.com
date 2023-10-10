package com.chhurngsapplication.app.modules.commentsothea.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentSotheaBinding
import com.chhurngsapplication.app.modules.commentsothea.`data`.viewmodel.CommentSotheaVM
import kotlin.String
import kotlin.Unit

class CommentSotheaActivity :
    BaseActivity<ActivityCommentSotheaBinding>(R.layout.activity_comment_sothea) {
  private val viewModel: CommentSotheaVM by viewModels<CommentSotheaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentSotheaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SOTHEA_ACTIVITY"

  }
}
