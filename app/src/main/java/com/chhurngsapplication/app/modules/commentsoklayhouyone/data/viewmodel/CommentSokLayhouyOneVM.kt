package com.chhurngsapplication.app.modules.commentsoklayhouyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.commentsoklayhouyone.`data`.model.CommentSokLayhouyOneModel
import org.koin.core.KoinComponent

class CommentSokLayhouyOneVM : ViewModel(), KoinComponent {
  val commentSokLayhouyOneModel: MutableLiveData<CommentSokLayhouyOneModel> =
      MutableLiveData(CommentSokLayhouyOneModel())

  var navArguments: Bundle? = null
}
