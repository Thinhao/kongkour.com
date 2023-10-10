package com.chhurngsapplication.app.modules.commenthannahone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commenthannahone.`data`.model.CommentHannahOneModel
import org.koin.core.KoinComponent

class CommentHannahOneVM : ViewModel(), KoinComponent {
  val commentHannahOneModel: MutableLiveData<CommentHannahOneModel> =
      MutableLiveData(CommentHannahOneModel())

  var navArguments: Bundle? = null
}
