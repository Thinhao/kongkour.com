package com.chhurngsapplication.app.modules.commentnathan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentnathan.`data`.model.CommentNathanModel
import org.koin.core.KoinComponent

class CommentNathanVM : ViewModel(), KoinComponent {
  val commentNathanModel: MutableLiveData<CommentNathanModel> =
      MutableLiveData(CommentNathanModel())

  var navArguments: Bundle? = null
}
