package com.chhurngsapplication.app.modules.commenthannah.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commenthannah.`data`.model.CommentHannahModel
import org.koin.core.KoinComponent

class CommentHannahVM : ViewModel(), KoinComponent {
  val commentHannahModel: MutableLiveData<CommentHannahModel> =
      MutableLiveData(CommentHannahModel())

  var navArguments: Bundle? = null
}
