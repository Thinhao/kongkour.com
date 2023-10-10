package com.chhurngsapplication.app.modules.commentsotheaone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentsotheaone.`data`.model.CommentSotheaOneModel
import org.koin.core.KoinComponent

class CommentSotheaOneVM : ViewModel(), KoinComponent {
  val commentSotheaOneModel: MutableLiveData<CommentSotheaOneModel> =
      MutableLiveData(CommentSotheaOneModel())

  var navArguments: Bundle? = null
}
