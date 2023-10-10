package com.chhurngsapplication.app.modules.commentthearith.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentthearith.`data`.model.CommentThearithModel
import org.koin.core.KoinComponent

class CommentThearithVM : ViewModel(), KoinComponent {
  val commentThearithModel: MutableLiveData<CommentThearithModel> =
      MutableLiveData(CommentThearithModel())

  var navArguments: Bundle? = null
}
