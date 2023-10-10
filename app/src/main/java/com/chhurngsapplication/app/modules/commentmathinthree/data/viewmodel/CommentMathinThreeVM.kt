package com.chhurngsapplication.app.modules.commentmathinthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentmathinthree.`data`.model.CommentMathinThreeModel
import org.koin.core.KoinComponent

class CommentMathinThreeVM : ViewModel(), KoinComponent {
  val commentMathinThreeModel: MutableLiveData<CommentMathinThreeModel> =
      MutableLiveData(CommentMathinThreeModel())

  var navArguments: Bundle? = null
}
