package com.chhurngsapplication.app.modules.commentscooper.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentscooper.`data`.model.CommentScooperModel
import org.koin.core.KoinComponent

class CommentScooperVM : ViewModel(), KoinComponent {
  val commentScooperModel: MutableLiveData<CommentScooperModel> =
      MutableLiveData(CommentScooperModel())

  var navArguments: Bundle? = null
}
