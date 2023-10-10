package com.chhurngsapplication.app.modules.commentscooperone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentscooperone.`data`.model.CommentScooperOneModel
import org.koin.core.KoinComponent

class CommentScooperOneVM : ViewModel(), KoinComponent {
  val commentScooperOneModel: MutableLiveData<CommentScooperOneModel> =
      MutableLiveData(CommentScooperOneModel())

  var navArguments: Bundle? = null
}
