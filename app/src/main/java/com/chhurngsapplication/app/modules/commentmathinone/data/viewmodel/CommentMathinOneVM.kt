package com.chhurngsapplication.app.modules.commentmathinone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentmathinone.`data`.model.CommentMathinOneModel
import org.koin.core.KoinComponent

class CommentMathinOneVM : ViewModel(), KoinComponent {
  val commentMathinOneModel: MutableLiveData<CommentMathinOneModel> =
      MutableLiveData(CommentMathinOneModel())

  var navArguments: Bundle? = null
}
