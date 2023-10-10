package com.chhurngsapplication.app.modules.commentmathin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentmathin.`data`.model.CommentMathinModel
import org.koin.core.KoinComponent

class CommentMathinVM : ViewModel(), KoinComponent {
  val commentMathinModel: MutableLiveData<CommentMathinModel> =
      MutableLiveData(CommentMathinModel())

  var navArguments: Bundle? = null
}
