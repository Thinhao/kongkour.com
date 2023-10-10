package com.chhurngsapplication.app.modules.commentmathintwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentmathintwo.`data`.model.CommentMathinTwoModel
import org.koin.core.KoinComponent

class CommentMathinTwoVM : ViewModel(), KoinComponent {
  val commentMathinTwoModel: MutableLiveData<CommentMathinTwoModel> =
      MutableLiveData(CommentMathinTwoModel())

  var navArguments: Bundle? = null
}
