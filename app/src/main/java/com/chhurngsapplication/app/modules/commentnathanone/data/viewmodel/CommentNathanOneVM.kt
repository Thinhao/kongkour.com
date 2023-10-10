package com.chhurngsapplication.app.modules.commentnathanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentnathanone.`data`.model.CommentNathanOneModel
import org.koin.core.KoinComponent

class CommentNathanOneVM : ViewModel(), KoinComponent {
  val commentNathanOneModel: MutableLiveData<CommentNathanOneModel> =
      MutableLiveData(CommentNathanOneModel())

  var navArguments: Bundle? = null
}
