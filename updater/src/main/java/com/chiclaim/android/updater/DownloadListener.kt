package com.chiclaim.android.updater

import android.net.Uri

/**
 *
 * @author by chiclaim@google.com
 */
interface DownloadListener {


    fun onProgressUpdate(status: Int, totalSize: Long, downloadedSize: Long)


    fun onComplete(uri: Uri?)

    fun onFailed(e: Throwable)


}