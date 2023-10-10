package com.chhurngsapplication.app.modules.commentsoklayhouyone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCommentSokLayhouyOneBinding
import com.chhurngsapplication.app.modules.commentsoklayhouyone.`data`.viewmodel.CommentSokLayhouyOneVM
import kotlin.String
import kotlin.Unit

class CommentSokLayhouyOneActivity :
    BaseActivity<ActivityCommentSokLayhouyOneBinding>(R.layout.activity_comment_sok_layhouy_one) {
  private val viewModel: CommentSokLayhouyOneVM by viewModels<CommentSokLayhouyOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.commentSokLayhouyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMMENT_SOK_LAYHOUY_ONE_ACTIVITY"

  }
}
