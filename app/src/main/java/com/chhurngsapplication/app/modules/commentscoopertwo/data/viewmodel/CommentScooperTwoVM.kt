package com.chhurngsapplication.app.modules.commentscoopertwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentscoopertwo.`data`.model.CommentScooperTwoModel
import org.koin.core.KoinComponent

class CommentScooperTwoVM : ViewModel(), KoinComponent {
  val commentScooperTwoModel: MutableLiveData<CommentScooperTwoModel> =
      MutableLiveData(CommentScooperTwoModel())

  var navArguments: Bundle? = null
}
