package com.chhurngsapplication.app.modules.commentsoklayhouy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentsoklayhouy.`data`.model.CommentSokLayhouyModel
import org.koin.core.KoinComponent

class CommentSokLayhouyVM : ViewModel(), KoinComponent {
  val commentSokLayhouyModel: MutableLiveData<CommentSokLayhouyModel> =
      MutableLiveData(CommentSokLayhouyModel())

  var navArguments: Bundle? = null
}
