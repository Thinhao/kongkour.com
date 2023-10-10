package com.chhurngsapplication.app.modules.commentsothea.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentsothea.`data`.model.CommentSotheaModel
import org.koin.core.KoinComponent

class CommentSotheaVM : ViewModel(), KoinComponent {
  val commentSotheaModel: MutableLiveData<CommentSotheaModel> =
      MutableLiveData(CommentSotheaModel())

  var navArguments: Bundle? = null
}
