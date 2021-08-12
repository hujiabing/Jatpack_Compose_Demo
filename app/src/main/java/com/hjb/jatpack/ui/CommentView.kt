package com.hjb.jatpack.ui

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * @ClassName: CommentView
 * @Description:
 * @作者: hujiabing
 * @日期: 2021/8/9 6:27 下午
 */
@Composable
fun headView(title: String) {

    Button(onClick = { Log.e("========", "wwwww") }) {
        Text(text = title)
    }
}