package com.chhurngsapplication.app.modules.commentthearithone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentthearithone.`data`.model.CommentThearithOneModel
import org.koin.core.KoinComponent

class CommentThearithOneVM : ViewModel(), KoinComponent {
  val commentThearithOneModel: MutableLiveData<CommentThearithOneModel> =
      MutableLiveData(CommentThearithOneModel())

  var navArguments: Bundle? = null
}
