package com.superplusgames.hosandroi.aaaaactivv.bbbbbbr

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandroi.R
import com.superplusgames.hosandroi.databinding.ActivityBrovBinding
import com.superplusgames.hosandroi.ottther.Saaasha.DEEPLfrtggttggtfrfrfr
import com.superplusgames.hosandroi.ottther.Saaasha.MAIN_IDffrrfrrfgtggtgt5
import com.superplusgames.hosandroi.ottther.Saaasha.gtgt5gt5t5gt5
import com.superplusgames.hosandroi.ottther.Saaasha.linkfrrrfrffrgt5gtgt5t6g
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BrovActivity : AppCompatActivity() {

    var thyhy5yh5hy5yh5y: ValueCallback<Array<Uri>>? = null
    lateinit var g5t5gg5t5gt5gt: WebView

    var tgt5g5gttg588 = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (tgt5g5gttg588 == "") {
                tgt5g5gttg588 = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val gt5gt5tg8gt4h4y4h4yh = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val t32gt32gt32gt23gt23gt = gt5gt5tg8gt4h4y4h4yh.edit()
                t32gt32gt32gt23gt23gt.putString("SAVED_URL", lurlurlurlurlur)
                t32gt32gt32gt23gt23gt.apply()
            }
        }
    }

    lateinit var activityBrovBinding: ActivityBrovBinding
    var tggthyhyhyhyhhyhy: String? = null

    private val gtghyhyhyyhhyhyhy = 1

    private fun bgbghhhyyhhyy() {
        val tgt5g5gtgt55gtgt5gt5 = g5t5gg5t5gt5gt.settings
        tgt5g5gtgt55gtgt5gt5.javaScriptEnabled = true

        tgt5g5gtgt55gtgt5gt5.useWideViewPort = true

        tgt5g5gtgt55gtgt5gt5.loadWithOverviewMode = true
        tgt5g5gtgt55gtgt5gt5.allowFileAccess = true
        tgt5g5gtgt55gtgt5gt5.domStorageEnabled = true
        tgt5g5gtgt55gtgt5gt5.userAgentString = tgt5g5gtgt55gtgt5gt5.userAgentString.replace("; wv", "")

        tgt5g5gtgt55gtgt5gt5.javaScriptCanOpenWindowsAutomatically = true
        tgt5g5gtgt55gtgt5gt5.setSupportMultipleWindows(false)

        tgt5g5gtgt55gtgt5gt5.displayZoomControls = false
        tgt5g5gtgt55gtgt5gt5.builtInZoomControls = true
        tgt5g5gtgt55gtgt5gt5.setSupportZoom(true)

        tgt5g5gtgt55gtgt5gt5.pluginState = WebSettings.PluginState.ON
        tgt5g5gtgt55gtgt5gt5.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        tgt5g5gtgt55gtgt5gt5.setAppCacheEnabled(true)

        tgt5g5gtgt55gtgt5gt5.allowContentAccess = true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBrovBinding = ActivityBrovBinding.inflate(layoutInflater)
        setContentView(activityBrovBinding.root)

        g5t5gg5t5gt5gt = activityBrovBinding.vebbvfvfvfvfvf
        kotgtjijgtjtjijgtjigt()

        val nbgjbnbgnbgnbg = CookieManager.getInstance()
        nbgjbnbgnbgnbg.setAcceptCookie(true)
        nbgjbnbgnbgnbg.setAcceptThirdPartyCookies(g5t5gg5t5gt5gt, true)
        bgbghhhyyhhyy()
        val vfvfvfvvfvfbggbbgbg: Activity = this
        g5t5gg5t5gt5gt.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (bgbggbffff(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(vfvfvfvvfvfbggbbgbg, description, Toast.LENGTH_SHORT).show()
            }


        }
        g5t5gg5t5gt5gt.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                thyhy5yh5hy5yh5y?.onReceiveValue(null)
                thyhy5yh5hy5yh5y = filePathCallback
                var gtgtgtgttggtgtt5: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (gtgtgtgttggtgtt5!!.resolveActivity(packageManager) != null) {

                    var gt5gt5gt5gt5tg88gt8: File? = null
                    try {
                        gt5gt5gt5gt5tg88gt8 = jujujiii()
                        gtgtgtgttggtgtt5.putExtra("PhotoPath", tggthyhyhyhyhhyhy)
                    } catch (ex: IOException) {
                    }

                    if (gt5gt5gt5gt5tg88gt8 != null) {
                        tggthyhyhyhyhhyhy = "file:" + gt5gt5gt5gt5tg88gt8.absolutePath
                        gtgtgtgttggtgtt5.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(gt5gt5gt5gt5tg88gt8)
                        )
                    } else {
                        gtgtgtgttggtgtt5 = null
                    }
                }
                val tg5t5gt95gt5tg5 = Intent(Intent.ACTION_GET_CONTENT)
                tg5t5gt95gt5tg5.addCategory(Intent.CATEGORY_OPENABLE)
                tg5t5gt95gt5tg5.type = "image/*"
                val arrayOfIntents: Array<Intent?> =
                    gtgtgtgttggtgtt5?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val tgtgtgtgt6g6ttg3332 = Intent(Intent.ACTION_CHOOSER)
                tgtgtgtgt6g6ttg3332.putExtra(Intent.EXTRA_INTENT, tg5t5gt95gt5tg5)
                tgtgtgtgt6g6ttg3332.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imagefgtgt))
                tgtgtgtgt6g6ttg3332.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOfIntents)
                startActivityForResult(
                    tgtgtgtgt6g6ttg3332, gtghyhyhyyhhyhyhy
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var rfr5fr5rffr5rf = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!rfr5fr5rffr5rf.exists()) {
                    rfr5fr5rffr5rf.mkdirs()
                }

                rfr5fr5rffr5rf =
                    File(rfr5fr5rffr5rf.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return rfr5fr5rffr5rf
            }

        }

        g5t5gg5t5gt5gt.loadUrl(f5r5f5fr5frfr23fr2f3r2f2r2f2())
    }

    private fun kotgtjijgtjtjijgtjigt() {
        gtigjtigjtijgjtij()
    }

    private fun gtigjtigjtijgjtij() {
        Snackbar.make(
            activityBrovBinding.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun pushToOneSignalyhyyhy(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val tgt5gt5gt5gt5gtvb2b2b2b23 = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $tgt5gt5gt5gt5gtvb2b2b2b23"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vfvfv2fv2vfvf2vf23 =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vfvfv2fv2vfvf2vf23"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val fr2fr2f2fr2rf22rf3 = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $fr2fr2f2fr2rf22rf3"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun f5r5f5fr5frfr23fr2f3r2f2r2f2(): String {
        val sxxccvv = "com.superplusgames.hosandroi"
        val ccvfvgbggbhh = "deviceID="
        val hy2h5yh5y8 = "sub_id_1="
        val frtyuu333 = "naming"
        val gtg2yh2uju55ii9 = "deeporg"
        val f5r5ffr8rr8t9t9t9yy = "ad_id="
        val gt5g5y5hy8u8u8u = "sub_id_4="
        val t5gtgttg55g5t5gh4y4h4y44uju = "sub_id_5="
        val bhthtthht = Build.VERSION.RELEASE
        val g2gyhyhy2y223 = "sub_id_6="


        val vfvgbg226255447 = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val gbgb22655988899: String? = Hawk.get(DEEPLfrtggttggtfrfrfr, "null")
        val gtbtg5tg5tg5t588444:String? = Hawk.get(gtgt5gt5t5gt5, "null")
        val vfbgbhnjnj555112121: String? = Hawk.get(MAIN_IDffrrfrrfgtggtgt5, "null")

        val bhnhnhnnhnh2121215 = AppsFlyerLib.getInstance().getAppsFlyerUID(this)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val gbgbnhnnh2nh2h5nh5nh5hn9 = Hawk.get(linkfrrrfrffrgt5gtgt5t6g, "null")

        var vfbgbg2bg2bgb554847 = ""
        if (gtbtg5tg5tg5t588444 != "null"){
            vfbgbg2bg2bgb554847 = "$gbgbnhnnh2nh2h5nh5nh5hn9$hy2h5yh5y8$gtbtg5tg5tg5t588444&$ccvfvgbggbhh$bhnhnhnnhnh2121215&$f5r5ffr8rr8t9t9t9yy$vfbgbhnjnj555112121&$gt5g5y5hy8u8u8u$sxxccvv&$t5gtgttg55g5t5gh4y4h4y44uju$bhthtthht&$g2gyhyhy2y223$frtyuu333"
            pushToOneSignalyhyyhy(bhnhnhnnhnh2121215.toString())
        } else {
            vfbgbg2bg2bgb554847 = "$gbgbnhnnh2nh2h5nh5nh5hn9$hy2h5yh5y8$gbgb22655988899&$ccvfvgbggbhh$bhnhnhnnhnh2121215&$f5r5ffr8rr8t9t9t9yy$vfbgbhnjnj555112121&$gt5g5y5hy8u8u8u$sxxccvv&$t5gtgttg55g5t5gh4y4h4y44uju$bhthtthht&$g2gyhyhy2y223$gtg2yh2uju55ii9"
            pushToOneSignalyhyyhy(bhnhnhnnhnh2121215.toString())
        }
        return vfvgbg226255447.getString("SAVED_URL", vfbgbg2bg2bgb554847).toString()
    }


    private fun bgbggbffff(uri: String): Boolean {

        val vgbgb5g5g8b4gbbg4 = packageManager
        try {

            vgbgb5g5g8b4gbbg4.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gtghyhyhyyhhyhyhy || thyhy5yh5hy5yh5y == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(tggthyhyhyhyhhyhy))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    fnrnfnrf = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        thyhy5yh5hy5yh5y?.onReceiveValue(fnrnfnrf)
        thyhy5yh5hy5yh5y = null
    }


    private var jkikiiik = false
    override fun onBackPressed() {

        if (g5t5gg5t5gt5gt.canGoBack()) {
            if (jkikiiik) {
                g5t5gg5t5gt5gt.stopLoading()
                g5t5gg5t5gt5gt.loadUrl(tgt5g5gttg588)
            }
            this.jkikiiik = true
            g5t5gg5t5gt5gt.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                jkikiiik = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}