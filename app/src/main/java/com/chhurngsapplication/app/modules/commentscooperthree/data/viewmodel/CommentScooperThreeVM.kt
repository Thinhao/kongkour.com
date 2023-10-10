package com.chhurngsapplication.app.modules.commentscooperthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentscooperthree.`data`.model.CommentScooperThreeModel
import org.koin.core.KoinComponent

class CommentScooperThreeVM : ViewModel(), KoinComponent {
  val commentScooperThreeModel: MutableLiveData<CommentScooperThreeModel> =
      MutableLiveData(CommentScooperThreeModel())

  var navArguments: Bundle? = null
}
